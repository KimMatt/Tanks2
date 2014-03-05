package t2.entities;

public abstract class Entity {
	
	//X and Y coordinates of entity
	int[] x;
	int[] y;
	//Invalid coordinates exception.
	EntityException invldCoords =
			new EntityException(this, "Invalid coordinates!");
	
	/**
	 * Paints the entity on the given canvas.
	 */
	abstract void paint();

}
