
public class GuessingNumber {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		java.util.Random rand = new java.util.Random();
		
		int cNumber = rand.nextInt(11);
		System.out.print("Enter your guess: ");
		int guess = input.nextInt();
		do {
	
			System.out.print("Enter your guess: ");
			guess = input.nextInt();
		}while(cNumber != guess);
		System.out.println("great job! number is" + cNumber);
		System.exit(0);
	}
}
