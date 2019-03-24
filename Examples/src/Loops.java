//import java.util.Scanner;
//public class Loops {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter value to find factorial: ");
//		
//		long val = input.nextLong();
//		long fact;
//		
//		if(val == 0)
//			fact = 1;
//		else
//		{
//			while (val > 0)
//			{
//				fact = fact * val;
//				val = val - 1;
//			}
//		}
//		System.out.println("Factorial: " + fact);
////		
//		
//		//Print table
//		int value = 19;
//		for(int i = 0; i <= 20; i = i + 1)
//		{
//			System.out.println(value + " times " + i + " equals " + (value*i));
//		}
//		Scanner input = new Scanner(System.in);
//		int inValue;
//		int sum = 0;
//		int count = 0;
//		
//		System.out.println("Enter next score, type -1 if done.");
//		inValue = input.nextInt();
//		while(inValue != -1)
//		{
//			sum = sum + inValue;
//			count = count + 1;
//			System.out.println("Enter next score, type -1 if done.");
//			inValue = input.nextInt();
//			
//		}
//		
//		System.out.println("The average is: " + sum/count);
//
//	}
//
//}
