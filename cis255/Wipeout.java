/*
* George Westfall
* CIS255
* File: Wipeout.java
* Project: Homework 5 Notes
*/

import java.io.IOException;

public class Wipeout {
    public static void main(String[] args) {
        
        // init variables
        char inputChar = '\0';

        try {
            while((inputChar = (char)System.in.read()) != '\n') {
                if (inputChar == 'a' || inputChar == 'e') {
                    System.out.print("#");
                } else{
                    System.out.print(inputChar);
                }
            }

        } catch(IOException ioe) {
            System.err.println("An error occurred while reading input.");
        }

        // had to add this line to flush the buffer to display the output
        System.out.println();

    }
}
    
