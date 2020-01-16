package File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInteractions {
	
	public void reversePrint(ArrayList<String> readFile) { 
		Collections.reverse(readFile);
	}
	
	public void print(ArrayList<String> readFile) {
		System.out.println(readFile);
	}
	public static void main(String[] args) throws Exception{
		
		UserInteractions user = new UserInteractions();
		boolean fFound = false;
		Business read = new Business();
		Scanner input = new Scanner(System.in);
		do {
			try {
			System.out.println("Please enter file name.");
			String file = input.nextLine();
			ArrayList<String> lines = read.readFile(file);
			user.print(lines);
			user.reversePrint(lines);
			user.print(lines);
			
			System.out.println("Please enter the name of the file...NOT COMPLETE");
			String fileName =input.nextLine();
			if(fileName.equalsIgnoreCase(file)) {
				do {
					System.out.println("You cannot use the same file name.");
					System.out.println("Please enter the name of the new file to write.");
					fileName = input.nextLine();
				}while(fileName.equalsIgnoreCase(file));
			}
			read.writeFile(fileName, lines);
			fFound = true;
			}
			catch(FileMissingException e) {
				System.out.println(e.getMessage());
				fFound = false;
			}
		}while(!fFound);
		input.close();
	}
}


