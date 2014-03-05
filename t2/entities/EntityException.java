package t2.entities;

public class EntityException extends Throwable{

	//The entity that throws the exception.
	private final Entity thrower;
	
	/**
	 * The constructor for an entity exception
	 * @param thrower The Entity which throws this exception.
	 * @param message The message thrown.
	 */
	public EntityException(Entity thrower, String message) {
		super(message);
		this.thrower = thrower;
	}

	
}
