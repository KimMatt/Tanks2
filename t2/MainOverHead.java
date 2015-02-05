package t2;

import java.io.IOException;

import t2.view.Canvas;
import t2.playercontrols.ControlInput;
import t2.playercontrols.MainMenuControlSet;
import t2.playercontrols.PlayerControlSet;

public class MainOverHead {
	/*
	 * Tanks 2! 
	 * Made by: Matthew Kim
	 * www.github.com/KimMatt
	 */
	
	/*
	 * A static integer representing the game state, when it is 0 it is in the 
	 * main menu, when it is 1 it is in the main game, when it is 2 the game
	 * has ended.
	 */
	public static int gameState = 0;
	
	public static void main(String[] args) throws IOException {
		MainOverHead overhead = new MainOverHead();
		Canvas mainGame = new Canvas();
		overhead.instantiateMainMenu(mainGame);
		while(gameState == 0) {
			mainGame.repaint();
		}
		overhead.instantiateMainGame(mainGame);
		mainGame.repaint();
		while(gameState == 1) {
			mainGame.update();
		}
		System.exit(0);
	}
	
	/**
	 * Instantiates the main menu by adding a KeySet to the canvas for
	 * the main menu.
	 * @param c the canvas.
	 */
	public void instantiateMainMenu(Canvas c) {
		ControlInput controls = new ControlInput();
		MainMenuControlSet mmSet = new MainMenuControlSet(c.getM(), c);
		controls.setControlSet(mmSet);
		c.addKeyListener(controls);
	}
	
	/**
	 * Instantiates the main game by changing the ControlSet to the Player
	 * Control Set and calling the StartGame method from the canvas.
	 * @param c the canvas.
	 * @throws IOException 
	 */
	public void instantiateMainGame(Canvas c) throws IOException {
		PlayerControlSet player = new PlayerControlSet();
		c.getKeyListener().setControlSet(player);
		c.startGame();
	}
	
	public static void setGameState(int state){
		gameState = state;
	}
	
}
