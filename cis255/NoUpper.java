/*
* George Westfall
* CIS255
* File: NoUpper.java
* Project: Homework 5
// Write a Java class NoUpper which copies its input to output a character at a time, removing all
// upper case characters. Use System.in.read() and System.out.print() for input and output
// respectively. If the input is '\n' (newline) character, then exit the loop. (Use do…while loop)
*/

import java.io.IOException;

public class NoUpper {
    public static void main(String[] args) {
        
        // init variables
        char inputChar = '\0';

        try {
            do  {
                inputChar = (char)System.in.read();

                if (inputChar == '\n') {
                    break;
                }
                if (inputChar < 'A' || inputChar > 'Z') {
                    System.out.print (inputChar);
                }

            } while (true);
            
        } catch(IOException ioe) {
            System.err.println("An error occurred while reading input.");
        }

        // had to add this line to flush the buffer to display the output
        System.out.println();
    }
}
    
