
public class PrintFormatDemo { //%s and %.2f and print f 

	public static void main(String[] args) {
		String value = "Maria";
		double salary = 256.00;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("Enter how many hours did %s work?", value);
		int hours = input.nextInt();
		double hourlyRate = salary / hours;
		
		System.out.printf("%-s's hourly rate is %.2f", value, hourlyRate); //the negative creates a space
		
	}

}
