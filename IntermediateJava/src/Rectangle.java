import java.util.Scanner;
public class Rectangle {
	private Scanner input;
	private int side1, side2; //allows for instance variables
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.input = new Scanner(System.in);
		r1.getSides();
		int area = r1.calcArea(r1.side1, r1.side2);
		boolean large = r1.isLarge(area);
		
		r1.printSize(large);
		r1.input.close();
	}
	
	public void getSides() {
		System.out.println("please enter side 1 for height");
		side1 = input.nextInt(); //instance variable
		System.out.println("please enter side 2 for width");
		side2 = input.nextInt(); //instance variable
	}
	public int calcArea(int side1, int side2) {
		return side1 * side2;
	}
	public boolean isLarge(int area) {
		boolean large;
		if(area > 400)
			large = true;
		else large = false;
		return large;
	}
	public void printSize(boolean large) {
		if(large) System.out.println("This is a large rectangle");
		else System.out.println("this is a small rectangle");
	}
}
