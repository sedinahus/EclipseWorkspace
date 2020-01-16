
public class Movie {
	private String rating;
	private int id;
	private String title;
	
	public Movie() {
		rating = "";
		id = 0;
		title = "";
		
	}
	
	public Movie(String rating, int id, String title) {
		this.rating = rating;
		this.id = id;
		this.title = title;
	}
	
	public String getRating() {
		return rating;
	}
	
	public int getIdNum() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void setId(int id) {
		this.id = id; 
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double calcFee(int days) {
		return 2.0 * days;
	}
	
	public String toString() {
		return "\n(MPAA) Rating: " + rating + "\nID Number: " + id + "\nMovie Title: " + title;
	}

}
