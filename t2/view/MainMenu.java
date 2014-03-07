package t2.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MainMenu extends GamePanel{
	
	public void paint(Graphics g){
		g.setColor(Color.CYAN);
		g.drawString("TANKS!", 500, 500);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
