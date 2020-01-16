import java.util.Scanner;
public class NumberInputSample {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please enter a number: ");
	    int number = input.nextInt();
	    System.out.println("You entered " + number);
	    System.out.println("Bye!");
	  }
	}

