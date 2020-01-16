
public class RecoursionCountDown {
	int count;
	public static void main(String[] args) {
		RecoursionCountDown timer = new RecoursionCountDown();
		//option with recursive case
		//timer.getCount();
		
		timer.getCountIteration();
		timer.showCountDown();
		
	}
	public void getCount() {
		System.out.print("Enter a positive integer: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		count = input.nextInt();
		
		if(count <= 0) {
			System.out.println("You must enter a positive number.");
			System.out.println("Try again!");
			getCount();
		}
	}
	public void getCountIteration() {
		do {
			System.out.println("Enter a positive number.");
			java.util.Scanner input = new java.util.Scanner(System.in);
			count = input.nextInt();
			
			if(count <= 0) {
				System.out.println("Input must be a positive number.");
				System.out.println("Try again!");
			}
		
		}while(count <= 0);
	}
	public void showCountDown() {
		System.out.println("Counting down: ");
		for(int i = count; i >= 0; i--) {
			System.out.print(i + ", ");
		}
		System.out.println("Blast off!");
	}

}
