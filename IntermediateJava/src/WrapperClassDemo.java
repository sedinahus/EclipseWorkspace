
public class WrapperClassDemo {

	public static void main(String[] args) {
		System.out.println("The maximum integer is " + Integer.MAX_VALUE);
		System.out.println("The minimum integer is " + Integer.MIN_VALUE);
		
		Double  objDouble = 12.4; //same as new Double(12.4) but we do not use it anymore
		Double valueDouble = Double.valueOf(12.4); //how to assign value to wrapper class
		
		Integer objInteger = 12;
		Integer valueInteger = Integer.valueOf(12);
		
		int number = Integer.parseInt("1");
		double numberDouble = Double.parseDouble("7.1");
		
		String stringNumber = Integer.toString(1);
		
		//how to use big int
		java.math.BigInteger bigNumber1 = new java.math.BigInteger("12341234123412413412424124141241414123412341234");
		java.math.BigInteger bigNumber2 = new java.math.BigInteger("123");
		
		//System.out.println(bigNumber1 + bigNumber2);   cant use this
		java.math.BigInteger sum = bigNumber1.add(bigNumber2);
		java.math.BigInteger mul = bigNumber1.multiply(bigNumber2);
		
		
		
	}

}
