package Exception;

public class Lab3 {

	public static void main(String[] args) {
		int waitTime = 12;
		try {
			System.out.println("Try block entered");
			if(waitTime > 30) throw new Exception("over 30");
			else if(waitTime < 30) throw new Exception("under 30");
			else System.out.println("No exception");
			
			System.out.println("leaving try block");
		}

	catch(Exception throwObject) {
		System.out.println(throwObject.getMessage());
	}
	System.out.println("After catch blcok.");

	}
}
