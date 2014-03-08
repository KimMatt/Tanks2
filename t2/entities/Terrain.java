package t2.entities;

import java.awt.Graphics;

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

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
