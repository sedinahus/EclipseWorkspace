
public class ProjectTest {
	

	public static void main(String[] args) {
		CourseInfo[] c = new CourseInfo[10];
		c[0] = new CourseInfo("MATH 1111", "College Algebra", 3);
		c[1] = new CourseInfo("MATH 1113", "Precalculus", 4);
		c[2] = new CourseInfo("MATH 1401", "Intro to Stat", 3);
		c[3] = new CourseInfo("MATH 2200", "Calculus I", 4);
		c[4] = new CourseInfo("MATH 2000", "Statistics", 3);
		c[5] = new CourseInfo("MATH 2210", "Calculus II", 4);
		c[6] = new CourseInfo("MATH 2220", "Calculus III", 3);
		c[7] = new CourseInfo("MATH 2300", "Discrete Math", 3);
		c[8] = new CourseInfo("MATH 2450", "Linear Algebra", 3);
		c[9] = new CourseInfo("MATH 3021", "Geometry", 3);
		
//		StudentInfo(int studentID, String firstName, String lastName, char residency, String email)
		StudentInfo a = new StudentInfo("9000", "Bill", "Jones", 'Y', "bjones@ggc.edu");
		a.addcourse(c[0]);
		a.addcourse(c[3]);
		
		System.out.println(a);
		System.out.println("Tuition total: $" + calcTuition(a));
		System.out.println("Fees total: $" + calcFees(a));
		CourseInfo [] clist = a.getCourseList();
		for(int i = 0; i < a.getCourseCount(); i++)
			System.out.println(clist[i]);
		System.out.println("Total payment due: $" + (calcTuition(a) + calcFees(a)));
		
		//StudentInfo b = new StudentInfo(2000, "Apple", "Bob", 'N', "Apple.Bob@ggc.edu");
	}
	public static double calcFees(StudentInfo a) {
		double calcFees = 0;
		double tuition;
		int totalCredits = 0;
		CourseInfo[] clist = a.getCourseList();
		for(int i = 0; i < a.getCourseCount(); i++)
			totalCredits += clist[i].getCredits();
 
		if(totalCredits>=6)
			return 200;
		else return 100;
		
	}
	public static double calcTuition(StudentInfo a) {
		CourseInfo[] courseList = a.getCourseList();
		int totalCredits = 0;
		double tuition = 0;
		CourseInfo[] clist = a.getCourseList();
		for(int i = 0; i < a.getCourseCount(); i++)
			totalCredits += clist[i].getCredits();
		if(a.getResidency() == 'Y')
			tuition = totalCredits * 130.67;
		else tuition = totalCredits * 487.80;
		
//		if(totalCredits >= 6)
//			calcFees = 
		//for(int i = 0; i < a.courseCount; i++)
		return tuition;
	}

}
