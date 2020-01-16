import java.util.Scanner;
public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		System.out.println("The number if digits in " + n + " is " + countDigits(n));
	}
	public static int countDigits(int num) {
		if(num == 0)
			return 0;
		else
			return countDigits(num / 10) + 1;
	}

}
