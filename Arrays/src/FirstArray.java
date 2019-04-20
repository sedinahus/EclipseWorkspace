import java.util.Scanner;
public class FirstArray {

	public static void main(String[] args) {
//		int count;
//		System.out.println(count);
		String[] nameList = new String[50];
//		nameList[2] = "HanaBanana";
		
		readNames(nameList);
		for(int i = 0; i < nameList.length; i++)
			System.out.println(nameList[i]);
		
		//try an array of ints
//		int[] intList = new int[10];
//		for(int i = 0; i < intList.length; i++)
//			System.out.println(intList[i]);

	}
	public static int readNames(String[] names)
	{
		Scanner input = new Scanner(System.in);
		String name;
		int i = 0;
		//for(int i = 0; i < names.length; i++)
		do
		{
			System.out.println("Enter a name: type STOP when done.");
			name = input.nextLine();
			if(name.equals("STOP") == false)
			names[i] = name;
			//names[i] = input.nextLine();
			i++;
		}while(names[i-1].equals("STOP") == false);
		return (i-1);
	}

}
