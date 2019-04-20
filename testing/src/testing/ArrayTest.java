package testing;

public class ArrayTest {

	public static void main(String[] args) {
		long[] sequence = new long[50];
		sequence[0] = 0L;
		sequence[1] = 1L;
		sequence[2] = 1L;
		
		for(int i = 3; i < sequence.length; i++)
			sequence[i] = sequence[i-1] + sequence[i-2];
		
		for(int i =0; i < sequence.length; i++)
			System.out.println(sequence[i]);


	}

}
