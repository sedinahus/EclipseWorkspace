//import java.util.Stack;

public class StackV3 {
	public static void main(String[] args) {
	//Stack<String> stackOfPlates = new Stack<>();   this is another way of writing the below function
	
	//create a stack
	java.util.Stack<String> stackOfPlates = new java.util.Stack<>();
	
	//pushing newly washed plates to the stack
	stackOfPlates.push( "plates1");
	stackOfPlates.push( "plates2");
	stackOfPlates.push( "plates3");
	stackOfPlates.push( "plates4");
	stackOfPlates.push("plates5");
	
	System.out.println("Stack --> " + stackOfPlates);
	
	//pop each plate from the stack
	String plateAtTop = stackOfPlates.pop();
	System.out.println("stackOfPlate.pop() -->" + plateAtTop);
	System.out.println("Current stack --> " + stackOfPlates);
	
	//get the plate at the top of the stack without removing it
	plateAtTop = stackOfPlates.peek();
	System.out.println("stackOfPlates.peek() -->" + plateAtTop);
	System.out.println("current stack --> " + stackOfPlates);
	
	}
}

