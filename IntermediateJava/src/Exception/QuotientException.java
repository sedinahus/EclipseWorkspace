package Exception;

public class QuotientException {
	public static int quotient(int num1, int num2) {
		if(num2 ==0) throw new ArithmeticException("divisor cannot be zero.");
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		try {
			int result = quotient(number1, number2);
			System.out.println(number1 + " / " + number2 + " is " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception: an integer cannot be divided by zero.");
		}
		System.out.println("continues...");
	}
}
