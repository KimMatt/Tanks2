package t2.entities;

public interface canRotate {
	//constants for converting to and from radians
	double convertToRadian = Math.PI/180;
	double convertToDegrees = 180/Math.PI;
	//Get the angle
	public double getAngle();
	//Rotate the angle, in radians
	public void rotate(double theta);

}
