import java.io.File;

public class ComputeAverage {
	public static void main(String[] args) throws java.io.IOException{
		java.io.File file = new java.io.File("src/grades.txt");
		
		java.util.Scanner input = new java.util.Scanner(file);
		int average;
		int sum = 0;
		int count = 0;
		while(input.hasNext()) {
			String[] data = input.nextLine().split(" ");
			average = Integer.parseInt(data[data.length - 1]); //converts from string to int
			sum += average;
			count++;
			
		}
		System.out.println("Average of the quiz score is " + sum / count);
	}
}
