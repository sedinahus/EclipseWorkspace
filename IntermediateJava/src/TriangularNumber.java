
public class TriangularNumber {

	public static void main(String[] args) {
		int result = getTriangularNumber(10);
		System.out.println(result);

	}
	public static int getTriangularNumber(int n) {
		System.out.println("Entering " + n);
		if(n == 1) return 1;
		else {
			int temp = n + getTriangularNumber(n - 1);
			System.out.println("returning " + temp);
			return temp;
		}
		
	}
	public static int getTriangularNumberWhile(int n) {
		int i = 1;
		int sum = 0;
		while(i <= n) {
			sum += i;
			i++;
		}
		return sum;
	}


}
