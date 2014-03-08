package t2.playercontrols;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import t2.entities.*;
import t2.view.*;

/*
 * Tanks 2! 
 * Made by: Matthew Kim
 * www.github.com/KimMatt
 */

public class ControlInput implements KeyListener {
	ControlSet controls;
	
	public void setControlSet(ControlSet controls) {
		this.controls = controls;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		controls.keyPressed(arg0);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		controls.keyReleased(arg0);
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		controls.keyTyped(arg0);
		
	}

}
