package t2.entities;

public class Tank extends Entity implements canMove, canRotate {
	double theta = Math.PI/2;
	double dx = 0;
	double dy = 0;
	
	public Tank(int[] x, int[] y){
		super.x = x;
		super.y = y;
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
	void paint() {
		// TODO Auto-generated method stub
		
	}

}
