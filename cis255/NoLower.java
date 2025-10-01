/*
* George Westfall
* CIS255
* File: NoLower.java
* Project: Homework 5 Notes
*/

import java.io.IOException;

public class NoLower {
    public static void main(String[] args) {
        
        // init variables
        char inputChar = '\0';

        try {
            do  {
                inputChar = (char)System.in.read();

                if (inputChar == '\n')  {
                    break;
                } else if (inputChar < 'a' || inputChar > 'z')  {
                    System.out.print (inputChar);
                } else {
                    System.out.print('*');
                }

            } while (true);

        } catch(IOException ioe) {
            System.err.println("An error occurred while reading input.");
        }

        // had to add this line to flush the buffer to display the output
        System.out.println();

    }
}
    
