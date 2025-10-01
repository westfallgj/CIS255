/*
* George Westfall
* CIS255
* File: CountDown.java
* Project: Homework 5
// Write a Java class CountDown which accepts a string and a positive integer as input. Output the
// integer to the screen until it reaches zero, and then output the string to the screen. If the integer
// reaches 1, the loop should not output that number. If the integer value is greater than 10, output
// the integer while counting down until it reaches 11 and output the message "Aborting…" and exit
// the loop. Use java.util.Scanner and System.out.println() for input and output respectively. (Use for
// loop)
*/

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        
        // create scanner for input
        Scanner in = new Scanner(System.in);
        int posInt = 0;

        System.out.print("Enter a string: ");
        String phrase = in.next();

        System.out.print("Enter a positive integer: ");
        posInt = in.nextInt();


        for (int i = posInt; i > 0; i--) {
            if (i == 11)  {
                System.out.println("Aborting...");
                break;
            } else if (i == 1) {
                // Do nothing
            } else  {
                System.out.println(i);
            }
            if (i != 11)  {
                
            }
        }

        System.out.println(phrase);
            
        // had to add this line to flush the buffer to display the output
        System.out.println();

        in.close();
    }

}

