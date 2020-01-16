import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class WritingCourseScores {
	private Scanner input;
	private int score;
	public static void main(String[] args) throws IOException{
		WritingCourseScores w1 = new WritingCourseScores();
		w1.input = new Scanner(System.in);
		
		java.io.File score = new java.io.File("src/grades.txt");
		
		java.io.PrintWriter p1 = new java.io.PrintWriter(score);
		
		ArrayList<Integer> gradeList = new ArrayList<>();
		
		gradeList.add(w1.getData("Intermediate Programming"));
		gradeList.add(w1.getData("Software Developing"));
		gradeList.add(w1.getData("Discrete Math"));
		
		for(int i = 0; i < gradeList.size(); i++) {
			p1.println(gradeList.get(i));
		}
		p1.close();
	}
	public int getData(String courseName) {
		System.out.println("enter your wish score of " + courseName);
		score = input.nextInt();
		return score;
	}

}
