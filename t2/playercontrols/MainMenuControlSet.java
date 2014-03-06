package t2.playercontrols;

import java.awt.event.KeyEvent;

public class MainMenuControlSet extends ControlSet{

	@Override
	void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_UP)
			System.out.println("Affirmative");
		
	}

	@Override
	void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
