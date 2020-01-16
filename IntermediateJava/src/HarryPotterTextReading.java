import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class HarryPotterTextReading {

	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("src/harryPotter.txt");
		
		Scanner input = new Scanner(file);
		try {
			FileReader fr = new FileReader(file);
			input = new Scanner(fr);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
				
			}
		}catch(IOException ex) {
			System.out.println("Problem with file reading");
			ex.printStackTrace();
		}finally {
			input.close();
		}
	}

}
