import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int employeeNum;
		System.out.println("Enter your Employee number: ");
		employeeNum = input.nextInt();
		
		System.out.println("Enter your work hours: ");
		int hours;
		hours = input.nextInt();
		
		
		double grossPay = calcPay(hours);
		double deduction = calcDeduct(grossPay);
		double netPay = (grossPay - deduction);
		
		System.out.println("Employee ID: " + employeeNum);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deduction Amount: $" + deduction);
		System.out.println("Net Pay: $" + netPay);
		

	}
	public static double calcPay(int hours)
	{
		return 8.25 * hours;
	}
	public static double calcDeduct(double pay)
	{
		if(pay < 50)
			return .01 * pay;
		else if (pay >= 50 && pay < 200)
			return .05 * pay;
		else
			return .08 * pay;
	}

}
