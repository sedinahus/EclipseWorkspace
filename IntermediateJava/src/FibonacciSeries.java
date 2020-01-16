
public class FibonacciSeries {

	public static void main(String[] args) {
		int maxNum = 33; 
		int prevNum = 1;
		int nextNum = 1;
		
		System.out.println("The first " + maxNum + " numbers of the Fibonacci sequence are: ");
		
		for(int i = 0; i <= maxNum; i++) {
			System.out.println(prevNum  + " ");
			int sum = prevNum + nextNum;
			prevNum = nextNum;
			nextNum = sum;
		}
	}

}
