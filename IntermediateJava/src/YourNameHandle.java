import java.util.Scanner; 

public class YourNameHandle{
  public static void main(String[] args)
  {
     
    //complete here
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String isX = input.nextLine().toLowerCase(); 

     //complete here
    withoutX2(isX);
  }
  
  public static String withoutX2(String str)
  {
    //complete here
	  String placeholder = "Enter a String: ";
	  String temp = "";
	  for (int i = 0; i < str.length(); i++) {
		  	    if (i == 0 && str.charAt(i) != 'x')
		  	      temp += str.charAt(i);
		  	    else if (i == 1 && str.charAt(i) != 'x')
		  	      temp += str.charAt(i);
		  	    else if (i > 1)
		  	      temp += str.charAt(i);
		  	  }
		  	  return placeholder + temp;
	  
  }
  
}