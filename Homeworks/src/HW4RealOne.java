//sedina husanovic
import java.util.Scanner;

public class HW4RealOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double totalPaymentDue = 0;
		double totalAmountPaid = 0;
		double totalRemainBalance = 0;
		String custName;
		System.out.println("Enter Customer name (Enter STOP to stop entering values): ");
		custName = input.nextLine();
		
		while(custName.equals("stop")==false)
		{
			

		
		double custPaymentDue;
		System.out.println("Enter Payment Due: ");
		custPaymentDue = input.nextDouble();
		
		double custAmountPaid;
		System.out.println("Enter Amount Paid: ");
		custAmountPaid = input.nextDouble();

		double custRemainBalance;
		
		
			if(custPaymentDue > custAmountPaid)
			{
			custRemainBalance = custPaymentDue - custAmountPaid;
			totalAmountPaid = custAmountPaid;
			totalRemainBalance = custRemainBalance;
			}
			else custRemainBalance = 0;
			totalPaymentDue = totalPaymentDue + custPaymentDue;
			
			System.out.println("Print remaining balance: " + custRemainBalance);
			input.nextLine();
			
			System.out.println("Enter Your Name: ");
			custName = input.nextLine();
			
			//totalAmountPaid = custAmountPaid;
	    }
		
		
		System.out.println("---Summary---");
		System.out.println("Total Payment Due: " + totalPaymentDue);
		System.out.println("Total Amount Paid: " + totalAmountPaid);
		System.out.println("Total Remaining Balance: " + totalRemainBalance);
		
		
				
		
		
		
		
	}

}