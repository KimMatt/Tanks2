package t2.view;

import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JFrame;
import t2.MainOverHead;
import t2.playercontrols.ControlInput;

public class Canvas extends JFrame {
	MainOverHead overhead;
	/*
	 * A hashmap for the gameState as an integer paired with which JPanel is
	 * associated with it.
	 */
	HashMap<Integer, GamePanel> canvases;
	GamePanel m;
	GamePanel g;
	
	//Height of the screen, must be a multiple of 2.
	public static int height = 700;
	//Width of the screen, must be a multiple of 20.
	public static int width = 1200;
	
	/**
	 * Initiates the canvas, sets the size of the window, and adds the 
	 * main menu JPanel.
	 * @throws IOException
	 */
	public Canvas() throws IOException {
		m = new MainMenu();
		canvases = new HashMap<Integer, GamePanel>();
		this.frameInit();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setVisible(true);
		this.add(m);
		canvases.put(0, m);
		this.repaint();
	}
	
	/**
	 * Starts the main game by removing the main menu JPanel and
	 * adding the new main game JPanel
	 * @throws IOException
	 */
	public void startGame() throws IOException { 
		g = new MainGame();
		canvases.put(1, g);
		this.revalidate();
		this.remove(m);
		this.add(g);
		this.repaint();
	}
	
	/**
	 * Like the super addKeyListener but keeps a reference to the KeyListener
	 * to be returned, the Canvas should only have one KeyListener at a
	 * time. If one already exists it will replace it.
	 */
	@Override
	public void addKeyListener(KeyListener l) {
		if(super.getKeyListeners().length == 0) {
			super.addKeyListener(l);
		}
		else {
			this.removeKeyListener(super.getKeyListeners()[0]);
			super.addKeyListener(l);
		}
	}
	/**
	 * Returns the keyListener
	 * @return listener
	 */
	public ControlInput getKeyListener() {
		return (ControlInput) super.getKeyListeners()[0];
	}
	
	/**
	 * My own version of repaint, it updates the data and repaints the
	 * JPanels.
	 */
	public void repaint() {
		canvases.get(MainOverHead.gameState).paint(this.getGraphics());
	}
	
	public void update() {
		canvases.get(MainOverHead.gameState).update();
	}

	public MainMenu getM() {
		return (MainMenu)m;
	}

	public MainGame getG() {
		return (MainGame)g;
	}
	
}
