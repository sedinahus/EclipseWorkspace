
public class Comedy extends Movie{
	public Comedy() {
		super();
	}
	
	public Comedy(String rating, int id, String title) {
		super(rating, id, title);
	}
	
	public double calcFee(int days) {
		return 2.50 * days;
	}

}
