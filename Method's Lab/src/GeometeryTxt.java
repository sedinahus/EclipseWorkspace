import java.util.Scanner;

/**
 * This program demonstrates static methods
 */

public class GeometeryTxt {
	static int choice; // The user's choice
	static double value; // The method's return value
	static char letter; // The user's Y or N decision
	static double radius; // The radius of the circle
	static double length; // The length of the rectangle
	static double width; // The width of the rectangle
	static double height; // The height of the triangle
	static double base; // The base of the triangle
	static double side1; // The first side of the triangle
	static double side2; // The second side of the triangle
	static double side3; // The third side of the triangle

	/* printMenu
	 * The purpose of this method is to get the proper user feedback to execute the correct 
	 * calculation.
	 * 
	 * @return value of selected fields
	*/
	public static int printMenu() {
		System.out.print("This is a geometry calculator\n" + "Choose what you would like to calculate\n"
				+ "1. Find the area of a circle\n" + "2. Find the area of a rectangle\n"
				+ "3. Find the area of a triangle\n" + "4. Find the circumference of a circle\n"
				+ "5. Find the perimeter of a rectangle\n" + "6. Find the perimeter of a triangle\n"
				+ "Enter the number of your choice:\n" + "");
		Scanner menuOption = new Scanner(System.in);
		choice = menuOption.nextInt();
		return choice;
	}
	
	/* circleArea
	 * The purpose of this method is to calculate area of the circle it accepts a radius @param
	 * that gets input from the user
	 * 
	 * @return area of a circle
	*/
	public static double circleArea(double radius) {
		System.out.print(radius);
		value = Math.PI * (radius * radius);
		System.out.print("This is inside of my circleArea method " + value);
		return value;
	}

	/* rectangleArea
	 * The purpose of this method is to calculate area of a rectangle and it accepts 2 @param
	 * length and width that will be entered by the user
	 * 
	 * @return area of a rectangle
	*/
	public static double rectangleArea(double length, double width) {
		value = length * width;
		return value;
	}

	/* triangleArea
	 * The purpose of this method is to calculate area of a triangle that accepts 2 @param
	 * height and base
	 * 
	 * @return area of a triangle
	*/
	public static double triangleArea(double height, double base) {
		value = (height * base) / 2;
		return value;
	}

	/* circleCircumference
	 * The purpose of this method is to calculate the circumference of a circle it accepts 1 @param
	 * radius which is entered by the user
	 * 
	 * @return circumference of a circle
	*/
	public static double circleCircumference(double radius) {
		value = Math.PI * (radius * 2);
		return value;
	}

	/* rectanglePerimeter
	 * The purpose of this method is to calculate the perimeter of a rectangle that accepts 2 @param
	 * length and width which is entered by the user
	 * 
	 * @return perimeter of a rectangle
	*/
	public static double rectanglePerimeter(double length, double width) {
		value = (2 * length) + (2 * width);
		return value;
	}

	/* trianglePerimeter
	 * The purpose of this method is to calculate the perimeter of a triangle that accepts 3 @param
	 * side1, side2 and side3 which is entered by the user
	 * 
	 * @return perimeter of a triangle
	*/
	public static double trianglePerimeter(double side1, double side2, double side3) {
		value = side1 + side2 + side3;
		return value;
	}

	public static void main(String[] args) {
		// Create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// The do loop allows the menu to be displayed first
		do {
			// TASK #1 Call the printMenu method

			printMenu();
//			THIS IS NOT NEEDED IT COMES FROM printMenu
//			choice = keyboard.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the radius of " + "the circle: ");
				radius = keyboard.nextDouble();

				// TASK #3 Call the circleArea method and
				circleArea(radius);
				System.out.print("VALUE SOP" + value);
				// store the result in the value variable

				System.out.println("The area of the " + "circle is " + value);
				break;
			case 2:
				System.out.print("Enter the length of " + "the rectangle: ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of " + "the rectangle: ");
				width = keyboard.nextDouble();

				// TASK #3 Call the rectangleArea method and
				rectangleArea(length, width);
				// store the result in the value variable

				System.out.println("The area of the " + "rectangle is " + value);
				break;
			case 3:
				System.out.print("Enter the height of " + "the triangle: ");
				height = keyboard.nextDouble();
				System.out.print("Enter the base of " + "the triangle: ");
				base = keyboard.nextDouble();

				// TASK #3 Call the triangleArea method and
				triangleArea(height, base);
				// store the result in the value variable

				System.out.println("The area of the " + "triangle is " + value);
				break;
			case 4:
				System.out.print("Enter the radius of " + "the circle: ");
				radius = keyboard.nextDouble();

				// TASK #3 Call the circumference method and
				circleCircumference(radius);
				// store the result in the value variable

				System.out.println("The circumference " + "of the circle is " + value);
				break;
			case 5:
				System.out.print("Enter the length of " + "the rectangle: ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of " + "the rectangle: ");
				width = keyboard.nextDouble();

				// TASK #3 Call the perimeter method and
				rectanglePerimeter(length, width);
				// store the result in the value variable

				System.out.println("The perimeter of " + "the rectangle is " + value);
				break;
			case 6:
				System.out.print("Enter the length of " + "side 1 of the " + "triangle: ");
				side1 = keyboard.nextDouble();
				System.out.print("Enter the length of " + "side 2 of the " + "triangle: ");
				side2 = keyboard.nextDouble();
				System.out.print("Enter the length of " + "side 3 of the " + "triangle: ");
				side3 = keyboard.nextDouble();

				// TASK #3 Call the perimeter method and
				trianglePerimeter(side1, side2, side3);
				// store the result in the value variable

				System.out.println("The perimeter of " + "the triangle is " + value);
				break;
			default:
				System.out.println("You did not enter " + "a valid choice.");
			}
			keyboard.nextLine(); // Consume the new line

			System.out.println("Do you want to exit " + "the program (Y/N)?: ");
			String answer = keyboard.nextLine();
			letter = answer.charAt(0);

		} while (letter != 'Y' && letter != 'y');
	}

	// TASK #1 Create the printMenu method here
	// TASK #2 Create the value-returning methods here
	// TASK #4 Write javadoc comments for each method
}