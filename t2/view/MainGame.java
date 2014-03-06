package t2.view;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import t2.entities.Entity;

public class MainGame extends JPanel{
	ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public void paint(Graphics g) {
		for(int i = 0; i<entities.size(); i++) {
			entities.get(i).paint(g);
		}
	}

}
