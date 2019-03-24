//this program asks the user for a positive nonzero integer value. 
//The program should use a loop to get the sum of all the integers from 1 up to the number entered.
import java.util.Scanner;
public class NonzeroInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max;
		System.out.println("Enter max, enter a positive integer: ");
		max = input.nextInt();
//		while(max < 1)
//		{
//			System.out.print("Input must be a positive integer: ");
//			System.out.println("enter mx, must be a positive ineger:");
//			max = input.nextInt();
//		}
		
		int sum = 0;
		for(int count = 1; count <= max; count = count +1)
			sum = sum + count;
		System.out.println("sum: " + sum);
//		int count = 1;                 THIS IS AN EXMPLE OF HOW TO DO WITH WHILE LOOP
//		
//		while(count <= max)
//		{
//			sum = sum + count;
//			count = count + 1;
//			
//		}
//		System.out.print("Sum: " + sum);

	}

}
