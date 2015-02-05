package t2.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import t2.MainOverHead;

public class MainMenu extends GamePanel {
	Image title;
	/*
	 * Tells whether or not the main menu is in the middle of the 
	 * transition animation.
	 */
	boolean notInTransition;
	
	/**
	 * Reads in the image for the main menu and sets the notInTransition
	 * boolean to true.
	 * @throws IOException
	 */
	public MainMenu() throws IOException {
		title = ImageIO.read(new File("images/Tanks2Title.jpg"));
		notInTransition = true;
	}
	
	/**
	 * Paints the main menu.
	 */
	public void paint(Graphics g) {
		if(notInTransition){
		g.setColor(Color.CYAN);
		g.drawImage(title, 0, 0, null);
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Puts the automatic painting on hold and transitions the screen from the
	 * main menu to the game.
	 * @param g Graphics to be painted on.
	 */
	public void transition(Graphics g) {
		notInTransition = false;
		for(int i = 0; i<700; i+=20){
			g.drawImage(title, 0, -i, null);
		}
		MainOverHead.setGameState(1);
	}

}
