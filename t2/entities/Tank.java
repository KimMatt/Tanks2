package t2.entities;

import java.awt.Graphics;

public class Tank extends Entity implements canMove, canRotate {
	double theta;
	double dx;
	double dy;
	
	public Tank(int[] x, int[] y) throws EntityException{
		if(x.length == 2 && y.length == 2) {
			super.x = x;
			super.y = y;
			theta = Math.PI/2;
			dx = 0;
			dy = 0;
		}
		else {
			throw invldCoords;
		}
	}

	@Override
	public double getAngle() {
		return theta;
	}

	@Override
	public void rotate(double theta) {
		this.theta += theta;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
	}

	@Override
	public void setXSpeed(double dx) {
		this.dx = dx;
		
	}

	@Override
	public void setYSpeed(double dy) {
		this.dy = dy;
	}

	@Override
	public double getXSpeed() {
		return dx;
	}

	@Override
	public double getYSpeed() {
		return dy;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
