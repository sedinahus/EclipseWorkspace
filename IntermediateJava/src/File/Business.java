package File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Business {
	public ArrayList<String> readFile(String fileName) throws FileMissingException{
		ArrayList<String> lines = new ArrayList<String>();
		
		try {
			FileReader fr = new FileReader(fileName);
			Scanner inFile = new Scanner(fr);
		
			while(inFile.hasNextLine()) {
				lines.add(inFile.nextLine());
			}
			inFile.close();
			fr.close();
		}
		catch(FileNotFoundException e) {
			throw new FileMissingException(fileName + " was not found");
		}
		catch(IOException e) {
			throw new FileMissingException(fileName + " was not found. Please select another file");
		}
		return lines;
	}
	
	public String writeFile(String fileName, ArrayList<String> lines) throws FileMissingException{
		
		try {
			PrintWriter output = new PrintWriter(fileName);
			output.println(lines);
			output.close();
			
		}
		
		catch(FileNotFoundException e) {
			throw new FileMissingException(fileName + "was not found. Please select another file.");
		}
		return fileName;
	}
}
