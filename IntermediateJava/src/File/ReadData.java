package File;
import java.io.File;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws java.io.IOException{
		//create a file instance
		java.io.File file = new java.io.File("src/scores2.txt");
		
		//create a scanner for the file
		Scanner input = new Scanner(file);
		String name;
		int score;
		int sum = 0;
		int count = 0;
		//read data from a file
		while(input.hasNext()) {
			String[] data = input.nextLine().split(" ");
			score = Integer.parseInt(data[data.length - 1]); //converts from string to int
			sum += score;
			count++;
		}
		System.out.println("average of class scores is " + sum / count);
		//close file
		input.close();
	}

}
