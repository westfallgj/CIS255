/*
* George Westfall
* CIS255
* File: YourWeight.java
* Project: 3
*/

import java.util.Scanner;

public class YourWeight {
    public static void main(String[] args) {
        
        // init variables
        int weight = 0;

        // crete new scanner
        Scanner in = new Scanner(System.in);

        // grab input
        System.out.print("Enter weight in lbs: ");
        weight = in.nextInt();        

        // cycle through output choices based on input
        if ((weight >= 0) && (weight <= 50)) 
            System.out.println("Eat more.");            
        else if (weight <= 100)
            System.out.println("I hope you are short.");
        else if (weight <= 200)
            System.out.println("Quite average.");
        else if (weight <= 300)
            System.out.println("I hope you are tall.");
        else if (weight <= 500)
            System.out.println("Into sumo?");       
        else
            System.out.println("You liar!");

    }

}
    
