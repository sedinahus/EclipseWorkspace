package File;

import java.io.File;

public class WriteData {

	public static void main(String[] args)throws java.io.IOException {
		java.io.File file = new java.io.File("src/scores.txt");
		if(file.exists()) {
			System.out.println("Files already exists");
			System.exit(1);
		}
		
		java.io.PrintWriter write = new java.io.PrintWriter(file);
		//write formatted output to the file
		write.print("Jack Doe ");
		write.println(90);
		write.print("Eric K. Lawson");
		write.println(89);
		write.print("Kim Karns");
		write.println(76);
		
		//close the file
		write.close();
	}

}
