package t2.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import t2.view.Canvas;

public class Terrain extends Entity{
	
	public static int[] x;
	public static int[] y;
	
	/**
	 * The Terrain of the map, for every x point there should be a
	 * matching y points.
	 * @param x the X coordinates
	 * @param y the Y coordinates
	 * @throws EntityException when the x and y coordinates don't have
	 * a matching other.
	 */
	public Terrain(int[] x, int[] y) throws EntityException {
		if(x.length == y.length) {
			Terrain.x = x;
			Terrain.y = y;
		}
		else {
			throw invldCoords;
		}
	}
	
	public Terrain() {
		
	}
	
	public void generateTerrain(){
		Terrain.x = new int[Canvas.width + 2];
		Terrain.y = new int[Canvas.width + 2];
		int y = 400;
		Terrain.x[0] = 0;
		Terrain.y[0] = Canvas.height;
		Random randomGenerator = new Random();
		for(int i = 1; i <= Canvas.width; i +=4){
			Terrain.x[i] = i;
			Terrain.x[i+1] = i + 1;
			Terrain.x[i+2] = i + 2;
			Terrain.x[i+3] = i + 3;
			if(y == 550) {
			y--;
			Terrain.y[i] = y;
			Terrain.y[i+1] = y;
			Terrain.y[i+2] = y;
			Terrain.y[i+3] = y;
			}
			else if(y == 250) {
			y++;
			Terrain.y[i] = y;
			Terrain.y[i+1] = y;
			Terrain.y[i+2] = y;
			Terrain.y[i+3] = y;
			}
			else {
			int factor = ((int)Math.round(randomGenerator.nextInt(3)))-1;
			y = y + factor;
			Terrain.y[i] = y;
			Terrain.y[i+1] = y;
			Terrain.y[i+2] = y;
			Terrain.y[i+3] = y;
			}
		}
		Terrain.x[Canvas.width + 1] = Canvas.width;
		Terrain.y[Canvas.width + 1] = Canvas.height;
		
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillPolygon(Terrain.x, Terrain.y, Canvas.width + 2);
	}

}
