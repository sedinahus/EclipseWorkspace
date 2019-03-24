import java.io.Console;
import java.util.Scanner;
public class InClassLoopMethod2 {
//	Initialize my Global Variables
	static double assignmentAverage, 
	quizAverage, 
	examAverage, 
	projectAverage;

/**	when this method gets called, i initialized the variable sum to be 0
 * use scanner to get input from the user
 * next i will loop through 5 times to store the input of the user into sum
 * then i add sum to the assignment average variable
 * @return assignmentAverage
 */
	public static double calcAssignmentAverage() {
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 assignment grades");
		for(int i = 0; i < 5; i++) {
			sum = input.nextDouble();
			assignmentAverage = (assignmentAverage + sum);
		}

		return (assignmentAverage);
	}
	
/**	when this method gets called, i initialized the variable sum to be 0
	 * use scanner to get input from the user
	 * next i will loop through 5 times to store the input of the user into sum
	 * then i add sum to the quiz average variable
	 * @return quizAverage
	 */
	public static double calcQuizAverage() {
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 6 quiz grades");
		for(int i = 0; i < 6; i++) {
			sum = input.nextDouble();
			quizAverage = quizAverage + sum;
		}


		return (quizAverage);
	}
	
/**	when this method gets called, i initialized the variable sum to be 0
	 * use scanner to get input from the user
	 * next i will loop through 5 times to store the input of the user into sum
	 * then i add sum to the exam average variable
	 * @return examAverage
	 */
	public static double calcExamAverage() {
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 exam grades");
		for(int i = 0; i < 3; i++) {
			sum = input.nextDouble();
			examAverage = examAverage + sum;
		}


		return (examAverage);
	}
	
/**	when this method gets called, i initialized the variable sum to be 0
	 * use scanner to get input from the user
	 * next i will loop through 5 times to store the input of the user into sum
	 * then i add sum to the project average variable
	 * @return projectAverage
	 */
	public static double calcProjectAverage() {
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 project grades");
		for(int i = 0; i < 2; i++) {
			sum = input.nextDouble();
			projectAverage = projectAverage + sum;
		}


		return (projectAverage);
	}
	
/** i call the methods from above
 * then i calculate the final grade
 * @return "Your final grade is: " + finalGrade
 */
	public static String calcFinalGrade() {
		calcAssignmentAverage();
		calcQuizAverage();
		calcExamAverage();
		calcProjectAverage();
		
		double finalGrade = (((.20 * assignmentAverage)/5.0) + ((.20 * quizAverage)/6.0) + ((.50 * examAverage)/3.0) + ((.10 * projectAverage)/2.0));
		System.out.println("Your final grade is: " + finalGrade);
		
		return "Your final grade is: " + finalGrade;
	}

	public static void main(String[] args) {
		calcFinalGrade();
	}

}
