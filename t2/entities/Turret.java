package t2.entities;

import java.awt.Graphics;

public class Turret extends Entity implements canRotate{
	double theta;

	@Override
	public double getAngle() {
		return theta;
	}

	@Override
	public void rotate(double theta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
