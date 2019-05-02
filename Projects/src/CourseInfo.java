
public class CourseInfo {
	//fields
	private String courseID;
	private String courseName;
	private int credits;
	
//	public double total = 0.0;
//	final double IN_STATE_TUITION = 130.67;
//	final double OUT_OF_STATE_TUITION = 487.80;
	
	//constructor
	public CourseInfo(String subjectNumber, String subjectName, int numCredits) {
		courseID = subjectName;
		credits = numCredits;
		courseName = subjectName;
		
	}
	
	//get methods
	public String getCourseID() {
		return courseID;
	}

	public int getCredits() {
		return credits;
	}
	public String getCourseName() {
		return courseName;
	}
	
	//set methods
	public void setCourseID(String subjectNumber) {
		courseID = subjectNumber;
	}
	public void setCredits(int numCredits) {
		credits = numCredits;
	}
	public void setCourseName(String subjectName) {
		courseName = subjectName;
	}
	
	//string to string
	public String toString() {
		return "Course ID: " + getCourseID() + "Course Name: " + getCourseName() + "Credits: " + getCredits();
	}
	
	
	
}
