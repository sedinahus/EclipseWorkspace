
public class ArrayProcessor {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter the size of the array to be created: ");
    int size = input.nextInt();
 
    //(1) Question to ponder: Can you create an array that can store data of several different data types?
    //Answer: NO

    //(2) Create an int array (name it myList) that has the size the user just entered.
    int myList[] = new int[size];
    
    //(3) Question to ponder: Once an array is created, can its size be changed?
    //Answer: NO
    
    //(4) Fix the error below
    myList[0] = 6;
    
    //(5) Replace 0 below with the first array element
    System.out.println("The first array element is " + myList[0]);
    
    //(6) Fix the error below
    System.out.println("The last array element is " + myList[size - 1]);
    System.out.println("The last array element is " + myList[myList.length - 1]);
    
    //(7) Write a loop to get user enter values that will be stored in the array
    System.out.println("Enter " + myList.length + " values: ");
    for(int i = 0; i < myList.length; i++)
    {
    	myList[i] = input.nextInt();
    }

    
    //(8) Write a loop to print all the values stored in the array
    for(int i = 0; i < myList.length; i++)
    {
    	System.out.println(myList[i]);
    }
    
    
    //(9) Write a loop to calculate the sum of all array elements. 
    //    Then print the sum after the loop
    int total = 0;
    for(int i = 0; i < myList.length; i++)
    {
    	total += myList[1];
    }
    System.out.println("Your total is: " + total);
    
    //(10) Calculate and print the average of all the array elements
    System.out.println("Your average is: " + total/size);
    
    //(11) Write a loop to calculate the maximum value among all array elements. 
    //     Then print the maximum after the loop
    int max = myList[0];
    for(int i = 1; i < myList.length; i++)
    {
    	if(myList[i] > max)
    		max = myList[i];
    }
    System.out.println("Your max value is: " + max);
    
    //(12) Write a loop to calculate the minimum value among all array elements.
    //     Then print the minimum after the loop
    int min = myList[0];
    for(int i = 1; i < myList.length; i++)
    {
    	if(myList[i] < min)
    		min = myList[i];
    }
    System.out.println("Your min value is: " + min);
    
    //(13) Write a loop to left shift the array
    int shift = myList[0];
    for(int i = 1; i < myList.length; i++)
    {
    	myList[i - 1] = myList[i];
    }
    myList[myList.length - 1] = shift;
    
    //(14) Print the array again
    for(int i = 0; i < myList.length; i++)
    {
    	System.out.println(myList[i] + " ");
    }
    
    
  } //end of main
} //end of class ArrayProcessing
