
public class NameTester {

	public static void main(String[] args) {
		Name rm = new Name("Robert", "Mitchum");
		Name mc = new Name("Maria", "Complicated");
		System.out.println(rm + " is a legendary actor");
		System.out.println(mc + " becomes a famous developer and her first name is " + mc.getFirst() + ".");
	}

}
