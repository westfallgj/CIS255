/*
* George Westfall
* CIS255
* File: NoLower.java
* Project: Homework 5 Notes
*/

import java.io.IOException;
import java.util.Scanner;

public class UpDown {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // create scanner for input
        Scanner in = new Scanner(System.in);
        int posInt = 0;
        int negInt = 0;

        System.out.print("Enter a positive integer: ");
        posInt = in.nextInt();

        System.out.print("Enter a negative integer: ");
        negInt = in.nextInt();

        for (int i = 0; i < posInt; i++) {
            System.out.println(i);
        }

        for (int i = posInt; i > negInt; i--) {
            System.out.println(i);
        }
        
        // had to add this line to flush the buffer to display the output
        System.out.println();

        in.close();
    }

}

