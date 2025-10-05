/*
* George Westfall
* CIS255
* File: Project6.java
* Project: Project #6
// Write the interactive Java class Project6 that has the methods min(x, y, z) which returns the smallest
// value of doubles x, y, and z, and has the method average(a, b) which returns the average of ints a and
// b.
*/

import java.util.Scanner;

public class Project6 {
        public static void main(String[] args) {

            // init variables
            int alpha, beta;
            double xray, yankee, zebra;

            // grab a scanner
            Scanner in = new Scanner(System.in);

            // gather data
            System.out.print("Enter an a double: ");
            xray = in.nextDouble();

            System.out.print("Enter second double: ");
            yankee = in.nextDouble();

            System.out.print("Enter last double: ");
            zebra = in.nextDouble();

            System.out.print("Enter an integer: ");
            alpha = in.nextInt();

            System.out.print("Enter second integer: ");
            beta = in.nextInt();

            // call min method
            min(xray, yankee, zebra);
            // call average method
            average(alpha, beta);

            //close scanner
            in.close();
    }
    
    public static void min(double a, double b, double c) {

        // using the math library to cut down on coding
        double minimum = Math.min(a, b);
        minimum = Math.min(minimum, c);

        System.out.println("The minimum value is " + minimum);
        
    }

    public static void average(int a, int b) {

        // same average method from homework
        double average = (a + b) / 2.0;

        System.out.println("The average is " + average);
        
    }
}

