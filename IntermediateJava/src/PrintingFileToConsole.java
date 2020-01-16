import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintingFileToConsole {

	public static void main(String[] args) throws IOException{
		java.io.File file = new java.io.File("src/harryPotter.txt");
		Scanner input = new Scanner(file);
		
		try {
			FileReader fr = new FileReader(file);
			input = new Scanner(fr);
			printRecursive(input);
		}
		catch(IOException e){
			System.out.println("problem with file reading");
			e.printStackTrace();
		}
		finally {
			input.close();
		}
		
	}
	
	public static void print(Scanner input) {
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}
	public static void printRecursive(Scanner input) {
		if(!input.hasNextLine()) {
			return;
		}
		printRecursive(input);
		System.out.println(input.nextLine());
		
	}

}
