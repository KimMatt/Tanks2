package t2;

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
	
	public static void main(String args[]) {
		MainOverHead overhead = new MainOverHead();
		Canvas mainGame = new Canvas();
		overhead.instantiateMainMenu(mainGame);
		while(gameState == 0){
			mainGame.update();
		}
		overhead.instantiateMainGame(mainGame);
		while(gameState == 1){
			mainGame.update();
		}
		System.exit(0);
	}
	
	public void instantiateMainMenu(Canvas c) {
		ControlInput controls = new ControlInput();
		MainMenuControlSet mmSet = new MainMenuControlSet();
		controls.setControlSet(mmSet);
		c.addKeyListener(controls);
	}
	
	public void instantiateMainGame(Canvas c) {
		PlayerControlSet player = new PlayerControlSet();
		c.getKeyListener().setControlSet(player);
		c.startGame();
	}
	
}
