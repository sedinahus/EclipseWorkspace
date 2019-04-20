//Sedina Husanovic
import java.util.Scanner;
public class Homework5 {

	public static void main(String[] args) {
		   
		 String[] studentName = new String[5];
		 int[] studentScore = new int[5];
		 getData(studentName,studentScore);
		 int sum = getSum(studentScore);
		 int average = getAverage(studentScore);
		 int highest = getHighest(studentName,studentScore);
		 int lowest = getLowest(studentName,studentScore);
		 printAboveAvg(studentName,studentScore);
		 printBelowAvg(studentName,studentScore);
		 
		 System.out.println("Total is: " + sum);
		 System.out.println("Average is: " + average);
		 System.out.println("Highest value is: " + highest);
		 System.out.println("Lowest value is: " + lowest);

		}//end of main

		public static void getData(String[]studentName, int[]studentScore) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter five student names: ");
		 for(int i = 0; i < studentName.length; i++)
		  studentName[i] = input.nextLine();
		 System.out.println("Enter five student scores: ");
		 for(int i = 0; i < studentScore.length; i++)
		  studentScore[i] = input.nextInt();
		 
		}//end of getData

		public static int getSum(int[]array) {
		 int total = 0;
		 for (int i = 0; i < array.length; i++)
		  total += array[i];
		 return total;
		}//end of getTotal

		public static int getAverage(int[]array) {
		 int sum = 0;
		 for (int i = 0; i < array.length; i++)
		  sum += array[i];
		 int average = sum/array.length;
		 return average; 
		}//end of getAverage

		public static int getHighest(String[]studentName, int[]studentScore) {
		 int max = studentScore[0];
		 for (int i = 0; i < studentScore.length; i++)
		  if (studentScore[i] > max)
		   max = studentScore[i];
		 return max;
		}//end of getHighest

		public static int getLowest(String[]studentName, int[]studentScore) {
		 int min = studentScore[0];
		 for (int i = 0; i < studentScore.length; i++)
		  if (studentScore[i] < min)
		   min = studentScore[i];
		 return min;
		}//end of getHighest

		public static void printAboveAvg(String[]studentName,int[]studentScore) {
		 int average = getAverage(studentScore);
		 for (int i = 0; i < studentScore.length; i++) {
		  if (studentScore[i] > average)
		   System.out.println(studentName[i]);
		   
		 }
		 
		}//end of printAboveAvg

		public static void printBelowAvg(String[]studentName,int[]studentScore) {
		 int average = getAverage(studentScore);
		 for (int i = 0; i < studentScore.length; i++) {
		  if (studentScore[i] < average)
		   System.out.println(studentName[i]);
		}//end of printBelowAvg

		}
		}
