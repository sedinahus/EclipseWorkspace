
public class RecursiveTest1 {

	public static void main(String[] args) {
		RecursiveTest1 obj = new RecursiveTest1();
		obj.methodA(3);

	}
//	public void methodA(int n) {
//		if(n < 1)
//			System.out.println("b");
//		else
//		{
//			
//			methodA(n - 1);
//			System.out.println("n = " + n);
//			System.out.println("r");
//		}
	//}
	public void methodA(int n) {
		if(n < 1) {
			System.out.println("b");
		}
		else {
			System.out.print("r");
			methodA(n - 1);
		}
	}

}
