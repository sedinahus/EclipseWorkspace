package Exception;

public class DanceClassException {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter number of male dancers: ");
		int male = input.nextInt();
		
		System.out.print("Enter number of female dancers: ");
		int female = input.nextInt();
		
		try {
			if(male == 0 && female == 0) throw new Exception("Lesson is cancelled. No students");
			else if(male == 0) throw new Exception("Lession is cancelled. No male dancers");
			else if(female == 0) throw new Exception("Lesson is cancelled. No female dancers");
			
			if(female >= male) System.out.println("Each male must dance with " + female/(double)male + " female.");
			else System.out.println("Each female must dance with " + male / (double)female + " male.");
		}
		catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
			System.exit(0);
		}
		System.out.println("Let class begin.");
	}
	
	

}
