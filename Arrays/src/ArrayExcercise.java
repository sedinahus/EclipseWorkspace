import java.util.Scanner;
public class ArrayExcercise {

	public static void main(String[] args) {
		    double[] myArray = new double[10];
		    getData(myArray);
		    double total;
		    double average;
		    double highest;
		    double lowest;
		    
		     System.out.println("The total is: " + getTotal(myArray));
		     average = getAverage(myArray);
		     highest = getHighest(myArray);
		     lowest = getLowest(myArray);
		     
		    
		    
		  }// end of main
		  public static void getData(double[] arg)
		  {
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter ten decimal values: ");
		    for(int i = 0; i < arg.length; i++)
		    {
		      arg[i] = input.nextDouble();
		    }
		  }// end of getData
		  public static double getTotal( double[] arg)
		  {
		    double total = 0;
		    for(int i = 0; i < arg.length; i++)
		    {
		    	total += arg[i];
		    }
		   // System.out.println("The total is: " + total);
		    return total;
		  }// end of getTotal
		 
		  public static double getAverage(double[] arg)
		  {
			  //Scanner input = new Scanner(System.in);
			  double average = getTotal(arg)/arg.length;
//			  for(int i = 0; i < arg.length; i++)
//			  {
//				  average += arg[i];
//			  }
			  System.out.println("The average is: " + average);
			  return average;
		  }//end of getAverage
		  
		  public static double getHighest(double[] arg)
		  {
			  Scanner input = new Scanner(System.in);
			  double max = arg[0];
			  double highest = max;
			  for(int i = 0; i < arg.length; i++)
			  {
				  if(highest < arg[i])
				  {
					  highest = arg[i];
				  }
			  }
			  System.out.println("The highest is: " + highest);
			  return highest;
		  }// end of printHighest
		  
		  public static double getLowest(double[] arg)
		  {
			  Scanner input = new Scanner(System.in);
			  double min = arg[0];
			  double lowest = min;
			  for(int i = 0; i < arg.length; i++)
			  {
				  if(lowest > arg[i])
				  {
					  lowest = arg[i];
				  }
			  }
			  System.out.println("The lowest is: " + lowest);
			  return lowest;
		  }// end of printLowest
		 
}// end of class

