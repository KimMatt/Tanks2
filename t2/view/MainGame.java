package t2.view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import t2.entities.Entity;
import t2.entities.Terrain;
import t2.entities.notAutonomous;

public class MainGame extends GamePanel {
	ArrayList<Entity> entities = new ArrayList<Entity>();
	Image background;
	Graphics g;
	Terrain terrain;
	
	public MainGame() throws IOException{
		terrain = new Terrain();
		background = ImageIO.read(new File("images/Tanks2Title.jpg"));
		terrain.generateTerrain();
		entities.add(terrain);
	}
	
	/**
	 * Paints each entity.
	 */
	public void paint(Graphics g) {
		g.drawImage(background, 0, -700, null);
		for(Entity each: entities) {
			each.paint(g);
		}
	}
	
	/**
	 * Updates all entities that are not autonomous, ie. gravity.
	 */
	public void update() {
		for(Entity each: entities){
			if(each instanceof notAutonomous){
				((notAutonomous)each).update();
			}
		}
	}

}
