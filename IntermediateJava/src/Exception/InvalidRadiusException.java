//all the exception classes are inherited from throwable
//exception is the super class of InvalidRadiusException
package Exception;

public class InvalidRadiusException extends Exception{
	private double radius;
	
	public InvalidRadiusException(double radius) {
		super("invalid radius " + radius);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
}
