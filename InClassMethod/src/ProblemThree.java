
public class ProblemThree {

	public static void main(String[] args) {
		double score1 = 85;
		double score2 = 89;
		double score3 = 92;
		double score4 = 75;
		double score5 = 68;
		
		System.out.println("Grade for score #1 is " + determineGrade(score1));
		System.out.println("Grade for score #2 is " + determineGrade(score2));
		System.out.println("Grade for score #3 is " + determineGrade(score3));
		System.out.println("Grade for score #4 is " + determineGrade(score4));
		System.out.println("Grade for score #5 is " + determineGrade(score5));
		
		System.out.println("Average: " + calcAvg(score1, score2, score3, score4, score5));

	}
	public static double calcAvg(double score1, double score2, double score3, double score4, double score5)
	{
		return(score1 + score2 + score3 + score4 + score5)/5;
	}
	public static char determineGrade(double score)
	{
		char grade;
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else grade = 'F';
		return grade;
	}

}
