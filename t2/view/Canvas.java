package t2.view;

import javax.swing.JFrame;

public class Canvas extends JFrame {
	MainMenu m;
	MainGame g;
	
	public Canvas() {
		m = new MainMenu();
		this.frameInit();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1820,900);
		this.setVisible(true);
		this.add(m);
		this.repaint();
	}
	
	public void startGame() { 
		g = new MainGame();
		this.removeAll();
		this.revalidate();
		this.repaint();
		this.add(g);
	}
	
}
