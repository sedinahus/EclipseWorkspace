package File;

public class TestFileClass {
	public static void main(String[] args) {
		java.io.File file = new java.io.File("src/harryPotter.txt");
		System.out.println("Does it exist? " + file.exists());
		System.out.printf("The file has %,d bytes\n", file.length());
		System.out.printf("Can it be read? %b\n", file.canRead());
		System.out.printf("Can it be written %b\n", file.canWrite());
		System.out.printf("Is it a directory? %b\n", file.isDirectory());
		System.out.printf("Is it a file? %b\n", file.isFile());
		System.out.printf("Is it absolute? %b\n", file.isAbsolute());
		System.out.printf("Absolute path is %s\n", file.getAbsolutePath());
		System.out.printf("Last modified on %s\n", new java.util.Date(file.lastModified()));
	}
}
