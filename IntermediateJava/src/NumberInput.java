import java.util.*;
public class NumberInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    input.close();
    try {
      int number = input.nextInt();
      System.out.println("You entered " + number);
    }
    catch (InputMismatchException e) {
      System.out.println("You didn't enter a number!");
    }
//    catch (IllegalStateException e2) { 
//	    // do this if an IllegalStateException is caught
//         System.out.println("Illegal state exception");
//    }
    catch (NoSuchElementException e3) { 
	    // do this if an IllegalStateException is caught
         System.out.println("No such element exception");
    }
    finally {
	    // do this whether or not any exceptions are caught
    	System.out.println("This prints whether or not an exception is thrown");
	}

    System.out.println("Bye!");
  }
}