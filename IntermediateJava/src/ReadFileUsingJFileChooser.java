import java.util.Scanner;

import javax.swing.JFileChooser;

public class ReadFileUsingJFileChooser {

	public static void main(String[] args) throws Exception{
		JFileChooser fileChooser = new JFileChooser();
		if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			//get the selected file
			java.io.File file = fileChooser.getSelectedFile();
			
			//create a scanner for the file
			Scanner input = new Scanner(file);
			
			//read text from the file
			while(input.hasNext()) {
				System.out.println(input.nextLine());
			}
			
			//close the file
			input.close();
		}
		else {
			System.out.println("no file selected");
		}
	}

}
