/*
* George Westfall
* CIS255
* File: VolumeConeCalc.java
*/

import java.util.Scanner;

public class VolumeConeCalc {
        public static void main(String[] args) {
            //declare variables
            double height = 0, radius = 0, volume = 0;
            
            Scanner in = new Scanner(System.in);
            
            // grab input
            System.out.print("Enter height of the cone: ");
            height = in.nextDouble();     

            System.out.print("Enter radius of the cone: ");
            radius = in.nextDouble();   

            // formula is 𝒗 = 𝝅𝒉𝒓𝟐
            volume = Math.PI * height * (Math.pow(radius, 2));    

            // print output
            System.out.println("The volume of the cone is " + volume);

            // close scanner
            in.close();
    }    
}
