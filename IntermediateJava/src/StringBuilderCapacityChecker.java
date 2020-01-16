
public class StringBuilderCapacityChecker {

	public static void main(String[] args) {
		StringBuilder capa = new StringBuilder();
		int defaultCapacity = capa.capacity();
		
		System.out.println("Default number of the capacity is " + defaultCapacity);
		
		StringBuilder newString = new StringBuilder();
		System.out.println(newString.append("ooo").capacity());
		System.out.println(newString.append("xxxxxxxxxxxxxx").capacity()); //if length is > 16 and <= 34 new capacity will be 34

	}

}
