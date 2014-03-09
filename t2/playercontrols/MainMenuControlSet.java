package t2.playercontrols;

import java.awt.event.KeyEvent;

import t2.MainOverHead;
import t2.view.Canvas;
import t2.view.GamePanel;
import t2.view.MainMenu;

public class MainMenuControlSet extends ControlSet{
	GamePanel panel;
	Canvas c;

	public MainMenuControlSet(MainMenu p, Canvas c){
		this.panel = p;
		this.c = c;
	}
	
	/**
	 * When the enter key is released, we transition to the main game with
	 * an animation and change of the gameState.
	 */
	@Override
	void keyReleased(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER)
			((MainMenu)panel).transition(c.getGraphics());
		
	}

	@Override
	void keyTyped(KeyEvent arg0) {
	}
	
	@Override
	void keyPressed(KeyEvent arg0) {
	}

}
