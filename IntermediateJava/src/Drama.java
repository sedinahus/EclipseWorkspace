
public class Drama extends Movie{
	public Drama() {
		super();
		
	}
	
	public Drama(String rating, int id, String title) {
		super(rating, id, title);
	}
	
	public double calcFee(int days) {
		return 2.00 * days;
	}
}
