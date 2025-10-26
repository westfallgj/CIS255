import java.util.Scanner;
import java.util.Arrays;

/*
* George Westfall
* CIS255
* File: CircumferenceCalc.java
*
* Write the interactive Java class Project7 that has the methods max(a) which returns the largest value
* in double array a, and has the method reverse(a) which reverses the values in array a. Display the
* maximum value to the user, and display each value in the array after reversing. The array will have a
* length of 5 and will be populated from user input.
*/

public class ArrayMethods {
           public static void main(String[] args) {

            // init variables
            double[] userArray = new double[5];

            // grab a scanner
            Scanner in = new Scanner(System.in);

            System.out.println("We will need an array of 5 doubles.");

            // gather data
            for(int i = 0; i<5; i++)  {
                System.out.print("Enter a double for the array: ");
                userArray[i] = in.nextDouble();
            }

            // call min method
            max(userArray);
            // call average method
            reverse(userArray);

            //close scanner
            in.close();
    }
    
    public static void max(double[] userArray) {

        // using the math library to cut down on coding
        double maximum = 0;
        int startIndex = 0;
        int endIndex = userArray.length - 1;

        for(int i = startIndex; i <= endIndex; i ++)  {
            if(userArray[i] > maximum) {
                maximum = userArray[i];
            }
            
        }

        System.out.println("The max value of the array is " + maximum);
        
    }

    public static void reverse(double[] array) {

        // declare a new array
        int startIndex, endIndex;
        double temp;

        startIndex = 0;
        endIndex = array.length - 1;

        while (startIndex < endIndex)  {
            temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;

            startIndex++;
            endIndex--;
        }

        System.out.println("The reversed array is " + Arrays.toString(array));
        
    }
}
