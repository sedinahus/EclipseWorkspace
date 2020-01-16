
public class Course {
	private String courseName;
	private java.util.ArrayList<String> studentList = new java.util.ArrayList<>();
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		
	}
	public void addStudents(String studentName) {
		studentList.add(studentName);
		numberOfStudents++;
	}
	public void insertStudents(int index, String studentName) {
		studentList.add(index, studentName);
	}
	public  java.util.ArrayList<String>getStudentList() {
		return studentList;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudents(String studentName) {
		studentList.remove(studentName);
		numberOfStudents--;
	}
	public void dropStudentByIndex(int index) {
		studentList.remove(index);
		numberOfStudents--;
	}
			

}
