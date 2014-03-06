package t2.playercontrols;

import java.awt.event.KeyEvent;

public abstract class ControlSet {
	
	abstract void keyPressed(KeyEvent arg0);

	abstract void keyReleased(KeyEvent arg0);

	abstract void keyTyped(KeyEvent arg0);

}
