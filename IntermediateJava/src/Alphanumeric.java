
public class Alphanumeric {
	public static void main(String[] args) {
		Alphanumeric obj = new Alphanumeric();
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a string with non-alphanumeric characters.");
		String str = input.nextLine();
		System.out.println(obj.filter(str));
		
	}
	public String filter(String str) {
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLetterOrDigit(str.charAt(i))){
				s.append(str.charAt(i));
			}
		}
		return s.toString();
	}

}
