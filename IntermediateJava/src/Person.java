
public class Person {
	protected Name name; 
	protected char gender; //'m' or 'f'
	protected String id; //ssn
	
	public Person(Name name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Person(Name name, char gender, String id) {
		this.name = name;
		this.gender = gender;
		this.id = id;
	}
	
	public Name getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		String s = new String(name + "(gender: " + gender);
		if(id != null) 
			s += ": id:" + id;
		s += ")";
		return s;
	}
}
