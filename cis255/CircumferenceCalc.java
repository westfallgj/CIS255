/*
* George Westfall
* CIS255
* File: CircumferenceCalc.java
*/

import java.util.Scanner;

public class CircumferenceCalc {
        public static void main(String[] args) {
            
            // declare variables
            double radius, circumference;

            Scanner in = new Scanner(System.in);

            // grab input
            System.out.print("Enter the radius of the circle: ");
            
            radius = in.nextDouble();

            // formula is 𝒄 = 𝟐𝝅𝒓
            circumference = 2 * Math.PI * radius;
            
            // print output
            System.out.println("The circumference is " + circumference);

            // close scanner
            in.close();
    }    
}
