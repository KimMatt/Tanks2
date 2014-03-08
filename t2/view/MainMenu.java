package t2.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MainMenu extends GamePanel {
	Image title;
	
	public MainMenu() throws IOException {
		title = ImageIO.read(new File("src/Tanks2Title.jpg"));
	}
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		g.drawImage(title, 300, 300, null);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
