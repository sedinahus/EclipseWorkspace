import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) {
		//double bankBalance = 100.0;
		
		Scanner in = new Scanner(System.in);
		BankAccount[] accounts = new BankAccount[20];
		for (int i = 1; i < 21; i++) {
			accounts[i - 1] = new BankAccount(i, 100.0);
		}
		System.out.print("Enter an ID between 1-20: ");
		int id = in.nextInt();
		
		if (id < 1 || id > 20) {
			id = incorrectId(id);
		}
		
		while (true) {
			mainMenu();
			System.out.print("Please enter a choice: ");
			int choice = in.nextInt();
			
			if (choice == 4) {
				System.out.printf("%nEnter an ID between 1-20: ");
				id = in.nextInt();
				if (id < 1 || id > 20) {
					id = incorrectId(id);
				}
			}
			yourChoice(id, choice, accounts);
		}
		
	}
	
	public static int incorrectId(int id) {
		Scanner in = new Scanner(System.in);
		while (id < 1 || id > 20) {
			System.out.print("please enter a valid id: ");
			id = in.nextInt();
		}
		return id;
	}

	public static void yourChoice(int id, int choice, BankAccount[] accounts) {
	switch (choice) {
	case 1:
		System.out.printf("The balance is $%.1f%n", accounts[id - 1].getBankBalance());
		break;
	case 2:
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		accounts[id - 1].withdraw(in.nextDouble());
		break;
	case 3:
		Scanner money = new Scanner(System.in);
		System.out.print("Enter the amount to deposit: ");
		accounts[id - 1].deposit(money.nextDouble());
		break;
	default:
		break;
	}
 }
	
	public static void mainMenu() {
		System.out.printf("%nMain Menu%n");
		System.out.println("1: Check Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposit");
		System.out.println("4: Exit");
	}
	
}
