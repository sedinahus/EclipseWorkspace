import java.util.Scanner;
public class ReadStringClass {
	//input hello world
	//returns hello world
	public static void main(String[] args) {
		String str = readString();
		System.out.println(str);
	}
	
	public static String readString() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string");
		String str = input.nextLine();
		return str;
	}
}
