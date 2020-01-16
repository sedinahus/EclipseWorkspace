
public class CodingBat 
{
	
//	public static String getShoutingString(String str, int num) {
//		  String numA = "";
//		  for (int i = 0; i < num; i++){
//			  numA = numA + "a";
//		  }
//		return str + numA;
//		}
	
//	public static String getRidOfOddIndexChar( String str) {
//		for(int i = 0; i < str.length(); i++) {
//			if(i %2 != 0) {
//				System.out.println(str);
//			}
//			
//		}
//		System.out.println(str);
//		return str;
//		  
//	}
	
//	public static String getRidOfOddIndexChar(String str) {
//		String result = "";
//		String strArray[] = str.split("");
//		for(int i = 0; i < str.length(); i++) {
//			if(i % 2 == 0) {
//				result = result + strArray[i];
//			}
//		}
//		System.out.println(result);
//		return result;
//		  
//		}
	public static String changeVowels( String str) {
		System.out.println(str.replaceAll("[aeiou]", "x"));
		return str.toLowerCase().replaceAll("[aeiou]", "x");
	  }


	
 public static void main(String[] args)
 {
//	 getShoutingString("asdfghjk", 5);
	 
//	 getRidOfOddIndexChar("javascript"); //→ "jvsrp"	"javascript"	X	
//	 getRidOfOddIndexChar("code"); //→ "cd"	"code"	X	
//	 getRidOfOddIndexChar("pizza"); //→ "pza"	"pizza"	X	
//	 getRidOfOddIndexChar("hello");//→ "hlo"	"hello"	X	
//	 getRidOfOddIndexChar("night"); //→ "ngt"	"night"	X	
//	 getRidOfOddIndexChar("morning"); //→ "mrig"	"morning"
	 
	 changeVowels("hello");
	 
 }
	
}
