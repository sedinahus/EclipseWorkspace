import java.util.Scanner;

/**
 * Class: MethodTester.java
 * This class provides the driver for testing the MethodContainer class.
 * These classes simulate CodingBat.com
 * You are not modify this file.
 * Changes need to be made in the MethodContainer class.
 */
public class MethodTester {

    public static void main(String[] args) {
        MethodContainer methods = new MethodContainer();
        boolean again = true;
        Scanner input = new Scanner(System.in);
        do{
            int probNum = 0;
            System.out.println("1. Run your odd number array method.");
            System.out.println("2. Run your max from array method.");
            System.out.println("3. Run your transpose method.");
            System.out.println("4. Run your decimal to binary method.");
            System.out.println("5. Run your unique array method.");


            System.out.println("Please select the problem you would like to run.");
            probNum = input.nextInt();
            input.nextLine();


            switch(probNum){
                case 1:
                {

                    if( "{1,3,5}".equals(methods.getOddNumArray(5)))
                    {
                        System.out.println("Your answer was not correct. You return " + methods.getOddNumArray(5) + " instead of {1,3,5}");
                        break;
                    }
                    if("{1,3,5,7}".equals(methods.getOddNumArray(7)))
                    {
                        System.out.println("Your answer was not correct. You return " + methods.getOddNumArray(7) + " instead of {1,3,5,7}");
                        break;
                    }
                    System.out.println("You got them all right!");
                    break;
                }
                case 2:
                {
                    int[] nums = {1,2,3,4,5};
                    if( 5 != methods.getMaxFromArray(nums))
                    {
                        System.out.println("Your answer was not correct. You return " +   methods.getMaxFromArray(nums) + " instead of {1,3,5}");
                        break;
                    }
                    int[] secondNums =  {-1,-2,-3};
                    if(-1 != methods.getMaxFromArray(secondNums))
                    {
                        System.out.println("Your answer was not correct. You return " + methods.getMaxFromArray(nums)+ " instead of {-1,-2,-3}");
                        break;
                    }
                    System.out.println("You got them all right!");
                    break;                 }
                case 3:
                {
                     if(!methods.transpose("hello",0,4).equals("oellh"))
                    {
                        System.out.println("Your answer was not correct. You returned "
                        + methods.transpose("hello",0,4) + " instead of oellh. ");
                        break;
                    }

                    if(!methods.transpose("homework",2,4).equals("howemork"))
                    {
                        System.out.println("Your answer was not correct. You returned "
                                + methods.transpose("homework",2,4) + " instead of howemork. ");
                        break;
                    }

                   System.out.println("You got them all right!");
                    break;

                }
                case 4: {
                    if (methods.getDecimalFromBin(10) != 2)
                    {
                        System.out.println("Your answer was not correct. You return "
                                + methods.getDecimalFromBin(10) + " instead of 2. ");
                        break;
                    }

                    if (methods.getDecimalFromBin(1) != 1)
                    {
                        System.out.println("Your answer was not correct. You return "
                                + methods.getDecimalFromBin(1) + " instead of 1. ");
                        break;
                    }

                    if(methods.getDecimalFromBin(0) != 0)
                    {
                        System.out.println("Your answer was not correct. You return "
                                + methods.getDecimalFromBin(0) + " instead of 0. ");
                        break;
                    }
                }

                case 5:
                {
                    int[] nums = {4,5,6,9};
                    if(!methods.isUniqueArray(nums)){
                        System.out.println("Your answer was not correct. You return " +
                                methods.isUniqueArray(nums) + " instead of true.");
                        break;
                    }


                    System.out.println("You got them all right!");
                    break;
                }
            }

            System.out.println("Do you want to run this again? (Y/N)");
            String another = input.nextLine();
            if(another.charAt(0) != 'y' && another.charAt(0) != 'Y')
            {
                again = false;
            }
        }while (again);
    }
}