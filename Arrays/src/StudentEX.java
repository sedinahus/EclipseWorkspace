//This program is our first OOP(Object-Orientated Program) that we have written
//public class StudentEX {
//	//define fields for student class
//	private String studentId;
//	private String studentName;
//	
//	public int studentCount;
//	
//	//constructor(s)
//	public StudentEX(String id, String name)
//	{
//		studentId = id;
//		studentName = name;
//		studentCount++;
//		System.out.println("constructor called: " + id);
//	}
//	
//	//methods
//	public String getStudentId()
//	{
//		return studentId;
//	}
//	public String getStudentName()
//	{
//		return studentName;
//	}
//	//mutator methods
//	public static void
//	public void setStudentName(String name)
//	{
//		studentName = name;
//	}
//	public String toString()
//	{
//		return "ID: " + getStudentId() + " Name: " + getStudentName();
//	}
//
//	public static void main(String[] args) {
//		StudentEX st1 = new StudentEX("900", "John Doe"); //allocate space for student object
//		System.out.println(st1.studentId);
//		System.out.println(st1.studentName);
//		System.out.println("Count: " + st1.studentCount);
//		
//		StudentEX st2 = new StudentEX("100", "Bill");
//		System.out.println(st2.getStudentId());
//		System.out.println(st2.getStudentName());
//		System.out.println("Count: " + st2.studentCount);
//		
//		st2.setStudentName("Bill Jones");
//		System.out.println("After change: " + st2.getStudentName());
//		
//		System.out.println("After adding toString method" + st1);
//		//array of students
//		StudentEX[] studentList = new StudentEX[5];
//		studentList[0] = new StudentEX("100", "John Doe", "Math");
//		studentList[1] = new StudentEX("200", "Bill");
//		studentList[2] = new StudentEX("300", "Mary", "ITEC");
//		studentList[3] = new StudentEX("400", "Amy");
//		studentList[4] = new StudentEX("500", "Lisa", "Bio");
//		
//		for(int i=0; i < studentList.length; i++)
//			System.out.println(studentList[i]);
//		for(int i=0; i<studentList.length; i++)
//		{
//			if(studentList[i].getStudentMajor() == null);
//				studentList[i].setStudentMajor("Undecided");
//		}
//	}
//
//}
