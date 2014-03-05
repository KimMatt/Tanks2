package t2.entities;

public interface canMove {
	
	//Moves the moveable object
	public void move();
	//Sets the dx
	public void setXSpeed(double x);
	//Sets the dy
	public void setYSpeed(double y);
	//Returns dx
	public double getXSpeed();
	//Returns dy
	public double getYSpeed();

}
