package t2.view;

import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
	
	public Canvas() throws IOException {
		m = new MainMenu();
		canvases = new HashMap<Integer, GamePanel>();
		this.frameInit();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,700);
		this.setVisible(true);
		this.add(m);
		canvases.put(0, m);
		this.repaint();
	}
	
	public void startGame() { 
		g = new MainGame();
		this.removeAll();
		this.revalidate();
		this.repaint();
		this.add(g);
		canvases.put(1, g);
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
	 * My own version of update, it updates the data and repaints the
	 * JPanels.
	 */
	public void update() {
		canvases.get(MainOverHead.gameState).update();
		this.repaint();
	}
	
}
