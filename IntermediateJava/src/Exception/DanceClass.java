package Exception;

public class DanceClass {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter number of male dancer: ");
		int men = input.nextInt();
		
		System.out.print("Enter number of female dancer: ");
		int women = input.nextInt();
		
		if(men == 0 && women == 0) {
			System.out.println("Class is cancelled. No students");
			System.exit(0);
		}
		
		else if(men == 0) {
			System.out.println("Class is cancelled. No men");
			System.exit(0);
		}
		
		else if(women == 0) {
			System.out.println("Class is cancelled. No women");
		}
		
		if(women >= men) System.out.println("each man must dance with women. ");
		else System.out.println("Each woman must dance with " + men/(double) women + " men.");
		
		System.out.println("Begin the lesson.");
		
	}

}
