package FamilyTree;

public class Person {
	protected Name name;
	protected char gender;
	protected String ssn;
	protected Person mother; //this is recursive bc mother is refrence to Person object
	protected Person father; //this is recursive bc father is refrence to Person object
	
	protected int number; //number of the object
	protected static int count; //number of persons object in tree
	
	private static final String twoStars = "**";
	private static String tab = "";
	

	
	
	public Person(Name name, char gender) {
		this.name = name;
		this.gender = gender;
		number = ++count;
		
	}
	
	public Person(Name name, char gender, String ssn) {
		this(name, gender);
		this.ssn = ssn;
		number = ++count;
	}
	
	
	public Name getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public Person getMother() {
		return mother;
	}
	
	public Person getFather() {
		return father;
	}
	
	public static String getTwoStars() {
		return twoStars;
	}
	
	public String getTab() {
		return tab;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setMother(Person mother) {
		this.mother = mother;
	}
	
	public void setFather(Person father) {
		this.father = father;
	}
	
	public void setTab(String tab) {
		Person.tab = tab;
	}
	
	
	
	
	
	
	
	
	public String toString() {
		String s = new String(name + "(" + gender + ")" + " #" + number ); //added number here
		if(ssn != null) {
			s += ": ssn" + ssn;
		}
		s += "\n";
		
		if(mother != null) {
			tab = tab + twoStars;
			s += tab + "mother: " + mother;
			tab = tab.substring(2); //this is going to remove the first part of two stars
			++count;
			
		}
		if(father != null) {
			tab += twoStars; // add two stars
			s += tab + "father: " + father;
			tab = tab.substring(2);
			++count;
		}
		return s;
	}
	
}
