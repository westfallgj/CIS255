/*
* George Westfall
* CIS255
* File: ConvertWeight.java
*/

import java.util.Scanner;

public class ConvertWeight {
    public static void main(String[] args) {
        // 
        final double CONVERT_TO_POUNDS = 2.2;

        Scanner in = new Scanner(System.in);
        
        // declare variables
        Double weightInKilos, weightInPounds;

        // grab input
        System.out.print("Enter weight in kilos: ");
        weightInKilos = in.nextDouble();

        // formula is pounds = 2.2kilos
        weightInPounds = weightInKilos * CONVERT_TO_POUNDS;
        
        // print output
        System.out.println(weightInKilos + " kilos is equal to " + weightInPounds + "  pounds.");

        // close scanner
        in.close();
    }
}
