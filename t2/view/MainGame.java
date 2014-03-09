package t2.view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import t2.entities.Entity;

public class MainGame extends GamePanel {
	ArrayList<Entity> entities = new ArrayList<Entity>();
	Image background;
	Graphics g;
	
	public MainGame() throws IOException{
		background = ImageIO.read(new File("src/Tanks2Title.jpg"));
	}
	
	public void paint(Graphics g) {
		System.out.println("Whyy");
		g.drawImage(background, 0, -700, null);
		for(int i = 0; i<entities.size(); i++) {
			entities.get(i).paint(g);
		}
	}
	
	public void update() {
		
	}

}
