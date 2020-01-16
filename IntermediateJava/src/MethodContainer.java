import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class: MethodContainer
 * This class contains methods that you MUST complete
 * This class will be called by Method Tester and its methods will solve the problems
 * from MethodTester
 */
public class MethodContainer {


    /**
     * 1.Given a number n, this method will create an array with
     * odd number starting from 1 to n. e.g. 5 --> {1,3,5} ,
     * 3 --> {1,3,}
     * @param n
     * @return array of integers
     */
    public int[] getOddNumArray(int n) {
    	int[] value = new int[n];
    	int count = 0;
    	int count1 = 1;
    	for(int i = 0; i < n; i++) {
    		if((value[i] %2 != 0))
    		{
    			count ++;
    		}
    	}
    	for(int i = 0; i < count; i++) {
    		value[i] = count1;
    		count1 +=2;
    	}
    	return value;

    }

    /**
     * 2.Get the maximum int value in a given int array
     * e.g. [1,2,3] --> 3, [1,2,3,4,5] --> 5, [-1,-2,-3]--> -1
     * @param nums
     * @return maximum integer number
     */
    public int getMaxFromArray( int[] nums) {
    	int maxNum = nums[0];
    	for(int i = 0; i < nums.length; i++)
    	{
    		if(nums[i] > maxNum)
    		{
    			maxNum = nums[i];
    		}
    	}
    	return maxNum;

    }


    /**
     * 3.This method will transpose two letters in a String.
     * In addition to the input String, you have indices x and y
     * which represent the position of the characters you need to swap.
     * Return the String with the chars swapped.
     * e.g. transpose("hello",0,4) --> "oellh"
     * @param str
     * @param x
     * @param y
     * @return transposed String
     */
    public String transpose(String str, int x, int y) {
    	StringBuilder sb = new StringBuilder(str);
    	sb.setCharAt(x,  str.charAt(y));
    	sb.setCharAt(y, str.charAt(x));
    	return sb.toString();

    }

    /**
     * 4.This method return the decimal number from a binary number
     * e.g. getDecimalFromBin(0) --> 0, getDecimalFromBin(1) --> 1,
     * getDecimalFromBin(10) --> 2
     * @param num
     * @return converted decimal value from a binary value
     */
    public int getDecimalFromBin(int num) {
    	int deci = 0;
    	int c = 0;
    	
    	while(num != 0) {
    		deci = (int)(deci + ((num % 10) * Math.pow(2, c)));
    		num = num / 10;
    		c++;
    	}
    	return deci;

    }




    /**
     * 5.This method determines if an integer array contains unique numbers or not
     * @param nums
     * @return boolean value if the array is with unique/distinct numbers or not
     */
    public boolean isUniqueArray(int[] nums) {
    	for(int i = 0; i < nums.length - 1; i++)
    	{
    		for(int y = i + 1; y < nums.length; y++)
    		{
    			if(nums[i] == nums[i])
    				return true;
    		}
    	}
    		return false;


    }



}