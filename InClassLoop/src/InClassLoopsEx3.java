import java.util.Scanner;
public class InClassLoopsEx3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value, type -99 when done");
		int value = input.nextInt();
		int max = value;
		int min = value;
		
		while(value != -99)
		{
			if(value < min)
				min = value;
			if(value > max)
				max = value;
			System.out.println("Enter a value, type -99 when done");
			value = input.nextInt();
		}
		System.out.println("MAX: " + max);
		System.out.println("MIN: "+ min);

	}

}
