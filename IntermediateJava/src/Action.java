
public class Action extends Movie{
	public Action() {
		super();
	}
	
	public Action(String rating, int id, String title) {
		super(rating, id, title);
	}
	
	public double calcFee(int days) {
		return 3.00 * days;
	}
}
