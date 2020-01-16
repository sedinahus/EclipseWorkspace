import java.util.Scanner;

public class ReadStringInstanceMethod {
	
	private Scanner input;
	public static void main(String[] args) {
		ReadStringInstanceMethod rl = new ReadStringInstanceMethod();
		rl.input = new Scanner(System.in);
		String str = rl.readString(rl.input);
	}
	
	public String readString(Scanner input) {
		System.out.println("Please enter a string");
		String str = input.nextLine();
		return str;
	}
}
