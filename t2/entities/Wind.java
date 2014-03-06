package t2.entities;

import java.awt.Graphics;

public class Wind extends Entity implements canRotate{
	//Direction of the wind, in radians.
	public static double direction = 0;
	//Wind strength, must be >= 0 and <= 3
	public static int magnitude = 0;
	//Modifier, makes it easy to edit the physics of the game.
	public static final double modifier = 0.5;

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return direction, the direction of the wind.
	 * @Override
	 */
	public double getAngle() {
		return direction;
	}

	/**
	 * Rotates the direction of the wind by theta by adding theta to direction.
	 * @param theta The angle in radians by which the direction is to be
	 * rotated.
	 */
	public void rotate(double theta) {
		//Add theta to direction.
		Wind.direction += theta;
		//Keeps direction in between 0 and 2 Pi.
		while(direction > 2*Math.PI){
			Wind.direction -= 2*Math.PI;
		}
		while(direction < 0){
			Wind.direction += 2*Math.PI;
		}
	}
	
	/**
	 * Sets the magnitude of the wind.
	 * @param magnitude an integer <=0 and >= 3 that replaces magnitude.
	 */
	public void setMagnitude(int magnitude) {
		if(magnitude <= 3 && magnitude >=0)
		Wind.magnitude = magnitude;
	}
	
	/**
	 * Returns the x-value factor of an angle
	 * @param theta   the angle in radians between 0 and 2Pi
	 * @return factor a double from 0 to 1.5.
	 */
	public double getXFactor(){
		return Math.cos(Wind.direction) * Wind.modifier * Wind.magnitude;
	}
	
	/**
	 * Returns the y-value factor of an angle
	 * @param theta   the angle in radians between 0 and 2Pi
	 * @return factor a double from 0 to 1.5.
	 */
	public double getYFactor(){
		return Math.sin(Wind.direction) * Wind.modifier * Wind.magnitude;
		
	}

}
