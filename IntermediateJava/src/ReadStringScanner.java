import java.util.Scanner;

public class ReadStringScanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = readString(input); //make an argument for scanner
		System.out.println(str);
	}
	private Scanner input; //create an instance of scanner class
	public static String readString(Scanner input) { //using scanner instance read the string
		System.out.println("please enter a string");
		String str = input.nextLine();
		return str; //return string method
	}
}
