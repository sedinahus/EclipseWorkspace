package FamilyTree;

public class Name {
	private String first;
	private String middle;
	private String last;
	
	public Name() {
		//no-arg constructor
		//default constructor
	}
	
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public Name(String first, String middle, String last) {
		this.first = first;
		this.middle = middle;
		this.last = last;
		
	}
	public String getFirst() {
		return first;
	}
	
	public String getMiddle() {
		return middle;
	}
	
	public String getLast() {
		return last;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
		
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	@Override
	public String toString() {
		String s = new String();
		if(first != null)
			s += first + " ";
		if(middle != null)
			s += middle + " ";
		if(last != null)
			s += last + " ";
			return s.trim();
	}
	
}