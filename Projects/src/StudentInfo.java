
public class StudentInfo {
	//fields
	private String studentID;
	private String firstName;
	private String lastName;
	private char residency;
	private String email;
	
	CourseInfo[] studentCourse = new CourseInfo[5];
	int courseCount = 0;
	
	public void addcourse(CourseInfo c) {
		studentCourse [courseCount++] = c;
	}
	public int getCourseCount() {
		return courseCount;
	}
	public CourseInfo[] getCourseList() {
		return studentCourse;
	}
	
	//constructors
	public StudentInfo(String studentNum, String studentFirstName, String studentLastName, char character, String link) {
		studentID = studentNum;
		firstName = studentFirstName;
		lastName = studentLastName;
		residency = character;
		email = link;
	}
	
	//get methods
	public String getStudentID() {
		return studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public char getResidency() {
		return residency;
	}

	public String getEmail() {
		return email;
	}
	
	//set methods
	public void setStudentID(String studentNum) {
		studentID = studentNum;
	}
	public void setFirstName(String studentFirstName) {
		firstName = studentFirstName;
	}
	public void setLastName(String studentLastName) {
		lastName = studentLastName;
	}
	public void setResidency(char character) {
		residency = character;
	}
	public void setEmail(String link) {
		email = link;
	}
	//string to string
	public String toString() {
		return "Student ID: " + getStudentID() + " Student Name: " + getFirstName() + " " + getLastName() + " Residency?: " + getResidency() + " Email Address: " + getEmail();
	}
	

}
