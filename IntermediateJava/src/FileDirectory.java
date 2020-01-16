
public class FileDirectory {

	public static void main(String[] args) {
		System.out.print("Enter a directory or a file: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		String directory = input.nextLine();
		
		
		//display the size
		System.out.println(getSize(new java.io.File(directory)) + " bytes!");
	}
	public static long getSize(java.io.File file) {
		long size = 0;
		if(file.isDirectory()) {
			java.io.File[] files = file.listFiles(); // this array will have all files in sub directories
			for(int i =0; i < files.length && files  != null; i++) {
				size += getSize(files[i]);
			}
		}
		else {
		//base
		size += file.length();
		}
		return size;
	}

}
