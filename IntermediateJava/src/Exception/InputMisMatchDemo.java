package Exception;

import java.util.InputMismatchException;

public class InputMisMatchDemo {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.println("Enter an integer.");
				int number = input.nextInt();
				System.out.println("the number you entered is " + number);
				continueInput = false;
			}
			catch(InputMismatchException e) {
				System.out.println("try again. incorrect input");
				input.nextLine();
			}
		}while(continueInput);
	}

}
