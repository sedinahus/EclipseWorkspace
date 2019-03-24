import java.util.Scanner;
public class InclassloopsEx2 {
	
	public static void main(String[] args) {
		double speed;
		int hour;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed of the vehicle in miles per hour: ");
		speed = input.nextDouble();
		
		while(speed < 0)
		{
			System.out.println("Speed must be greater than zero, try again.");
			System.out.println("Enter speed of the vehicle in miles per hour");
			speed = input.nextDouble();
		}
		
		
		System.out.println("Enter time taken in hours: ");
		hour = input.nextInt();
		while(hour < 1 )
		{
			System.out.println("Hours must be one or more, try again");
			System.out.println("Enter time taken in hours.");
			hour = input.nextInt();
		}
		System.out.println("HOURS -- DISTANCE");
		int count = 1;
		while(count <= hour)
		{
			System.out.printf("%d ------ %.0f\n", count, speed * count);
			count ++;
		}
		
	}

}
