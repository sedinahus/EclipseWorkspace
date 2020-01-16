
public class MovieTester {

	public static void main(String[] args) {
		
		Action act = new Action("R", 3311999, "Matrix");
		Comedy com = new Comedy("R", 4822005, "Kung Fu Hustle");
		Drama dra = new Drama("R", 9231994, "The Shawshank Redemption");
		
		
		System.out.println(act + "\nLate Fee: $" + act.calcFee(2));
		System.out.println(com + "\nLate Fee: $" + com.calcFee(3));
		System.out.println(dra + "\nLate Fee: $" + dra.calcFee(4));
	}

}
