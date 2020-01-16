package ExceptionPart2;


public class TesterWithCustomizedException {

	public static void main(String[] args) {
		try {
			new Cube(5);
			new Cube(-5);
			new Cube(0);
			new Cube(-10);
		}
		catch(InvalidSideException ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("Proceed.");
		}
	}
}
	class Cube{
		private double side;
		
		public Cube() throws InvalidSideException{
			this(1.0);
		}
		
		public Cube (double newSide) throws InvalidSideException{
			setSide(newSide);
		}
		
		public double getSide() {
			return side;
		}
		
		public void setSide(double newSide)  throws InvalidSideException{
			if(newSide >= 0) {
				this.side = newSide;
			}
			else throw new InvalidSideException(newSide);
		}
	}

