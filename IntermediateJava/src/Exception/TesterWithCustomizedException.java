package Exception;

public class TesterWithCustomizedException {

	public static void main(String[] args) {
		try {
			new Circle(5);
			new Circle(-5);
			new Circle(0);
			new Circle(-10);
		}
		catch(InvalidRadiusException ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("Proceed.");
		}
	}
}
	class Circle{
		private double radius;
		
		public Circle() throws InvalidRadiusException{
			this(1.0);
		}
		
		public Circle (double newRadius) throws InvalidRadiusException{
			setRadius(newRadius);
		}
		
		public double getRadius() {
			return radius;
		}
		
		public void setRadius(double newRadius)  throws InvalidRadiusException{
			if(newRadius >= 0) {
				this.radius = newRadius;
			}
			else throw new InvalidRadiusException(newRadius);
		}
	}


