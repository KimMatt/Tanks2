package t2.entities;

import java.awt.Graphics;

public abstract class Entity {
	
	//X and Y coordinates of entity
	protected int[] x;
	protected int[] y;
	//Invalid coordinates exception.
	EntityException invldCoords =
			new EntityException(this, "Invalid coordinates!");
	
	/**
	 * Paints the entity on the given canvas.
	 */
	public abstract void paint(Graphics g);
	
	public void setX(int[] x) {
		this.x = x;
	}
	
	public void setY(int[] y) {
		this.y = y;
	}
	
	public void setX(int i, int x) {
		this.x[i] = x;
	}
	
	public void setY(int i, int y) {
		this.y[i] = y;
	}
	
	public int[] getX() {
		return x;
	}
	
	public int[] getY() {
		return y;
	}

}
