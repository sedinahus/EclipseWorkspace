
public class RecursionDemo {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("Add ten to your number.");
		//number = number - 10;
		displayAsWord(number);
	}
	
	//if a number is only a single digit, you can use switch
	//if you have multiple digit numbers, you will not be able to use switch
	public static void displayAsWord(int number) {
		
		//if you comment out if and else you will get the stackoverflow error
		if(number < 10) {
			System.out.print(getWordFromDigit(number)+ " ");
		}
		else {
			displayAsWord(number / 10);
			System.out.print(getWordFromDigit(number % 10) + " ");
		}
	}
	
	public static String getWordFromDigit(int digit) {
		String result = null;
		switch(digit) {
		case 0: result = "zero"; break;
		case 1: result = "one"; break;
		case 2: result = "two"; break;
		case 3: result = "three"; break;
		case 4: result = "four"; break;
		case 5: result = "five"; break;
		case 6: result = "six"; break;
		case 7: result = "seven"; break;
		case 8: result = "eight"; break;
		case 9: result = "nine"; break;
		default: System.out.println("Error occured");
		break;
		}
		return result;
	}

}
