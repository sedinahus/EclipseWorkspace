
public class PrintTriangle {

	public static void main(String[] args) {
		printTriangle(10);
		printTriangleString("[]", 5);
		printTriangleWhileString("[]", 5);
		printTriangleForStringReverse("[]", 5);
		System.out.println();
		printTriangleWhileReverse("[]", 5);
		printTriangleRecursion("[]", 5);
		printTriangleRecursionReverse("[]", 5);

	}
	public static void printTriangle(int n) {
		for(int i = 0; i <= n + 1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
	
	public static void printTriangleString(String str, int n) { 
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	public static void printTriangleWhileString(String str, int n) {
		int i = 0;
		while(i <= n) {
			int j = 0;
			while(j < i) {
				System.out.print(str);
				j++;
			}
			i++;
			System.out.println();
		}
	}
	public static void printTriangleForStringReverse(String str, int n) {
		for(int i = n + 1; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	public static void printTriangleWhileReverse(String str, int n) {
		int i = n;
		while(i > 0) {
			int j = i;
			while(j > 0) {
				System.out.print(str);
				j--;
			}
			i--;
			System.out.println();
		}
	}
	public static void printTriangleRecursion(String str, int n) {
		if(n < 1) return;
		printTriangleRecursion(str, n - 1);
		for(int i = 0; i < n; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	public static void printTriangleRecursionReverse(String str, int n) {
		if(n < 1) return;
		for(int i = 0; i < n; i++) {
			System.out.print(str);
		}
		System.out.println();
		printTriangleRecursionReverse(str, n - 1);
	}


}
