
public class Fibonacci {
	public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter an index for Fibonacci number: ");
        int index = input.nextInt();
        System.out.println("Fibonacci number at index " + index + " is " + fib(index));
    }
    public static long fib(long index){
    	int maxNum = 30;
    	int prevNum = 0;
    	int nextNum = 1;
    	
    	for(int i = 0; i <= maxNum; i++) {
    		System.out.println(prevNum + " ");
    		int sum = prevNum + nextNum;
    		prevNum = nextNum;
    		nextNum = sum;
    	}
    	return nextNum;


     }
}

