package t2.entities;

public class Bullet extends Entity implements canMove {
	//X and Y speeds
	double dx;
	double dy;
	//Wind, to keep track of direction
	Wind wind;
	
	/**
	 * Creates a new Bullet entity with its initial x and y points.
	 * @param x initial x position
	 * @param y initial y position
	 */
	public Bullet(int x, int y){
		super.x = new int[]{x};
		super.y = new int[]{y};
	}
	
	/**
	 * Moves the bullet, changing its x and y coordinates according to its
	 * speeds and wind direction + magnitude.
	 * @Override
	 */
	public void move() {
		super.x[0] += (wind.getXFactor());
		super.y[0] += (wind.getYFactor());
	}
	
	/**
	 * Sets the x-axis speed.
	 * @param dx new x-axis speed, must be a double.
	 * @Override
	 */
	public void setXSpeed(double dx) {
		this.dx = dx;
	}

	/**
	 * Sets the y-axis speed.
	 * @param dy new y-axis speed, must be a double
	 * @Override
	 */
	public void setYSpeed(double dy) {
		this.dy = dy;
	}

	/**
	 * @return dx the double representing the bullet's x-axis speed.
	 * @Override
	 */
	public double getXSpeed() {
		return this.dx;
	}

	/**
	 * @return dy the double representing the bullet's y-axis speed.
	 * @Override
	 */
	public double getYSpeed() {
		return this.dy;
	}

	@Override
	void paint() {
		// TODO Auto-generated method stub
		
	}

}
