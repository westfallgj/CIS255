/*
* George Westfall
* CIS255
* File: Normal.java
* Project: Homework 5
// Write a Java class Normal, which copies its input to output a character at a time, replacing blank
// space characters and tab characters with '=' (equal sign) characters. Use System.in.read() and
// System.out.print() for input and output respectively. If the input is '\n' (newline) character, then
// exit the loop. (Use while loop)
*/

import java.io.IOException;

public class Normal {
    public static void main(String[] args) {
        
        // init variables
        char inputChar = '\0';

        try {
            while((inputChar = (char)System.in.read()) != '\n') {
                if (inputChar == ' ' || inputChar == '\t') {
                    System.out.print("=");
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
    
