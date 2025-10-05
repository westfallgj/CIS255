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

            // Hard
            Scanner in = new Scanner(System.in);
            int alpha, beta;
            double xray, yankee, zebra;

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

            min(xray, yankee, zebra);
            average(alpha, beta);

            in.close();
    }
    
    public static void min(double a, double b, double c) {

        // using hte math library to cut down on coding
        double minimum = Math.min(a, b);
        minimum = Math.min(minimum, c);

        System.out.println("The minimum value is " + minimum);
        
    }

    public static void average(int a, int b) {

        double average = (a + b) / 2.0;

        System.out.println("The average is " + average);
        
    }
}

