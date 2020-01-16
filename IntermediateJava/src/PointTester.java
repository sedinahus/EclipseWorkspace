
public class PointTester {

	public static void main(String[] args) {
		NamePointer q = new NamePointer(3, 5, "Q");
		System.out.println("P: " + q);
		System.out.println("q.getName(): " + q.getpName());
		
		System.out.println("q.getX(): " + q.getX());
		
		NamePointer x = new NamePointer(3, 5, "X");
		System.out.println("x.equals(q): " + x.equals(q));
		
	}

}
