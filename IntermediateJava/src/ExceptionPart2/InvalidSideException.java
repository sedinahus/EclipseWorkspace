package ExceptionPart2;

public class InvalidSideException extends Exception{
	private double side;
	
	public InvalidSideException(double side) {
		super("invalid side" + side);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
}
