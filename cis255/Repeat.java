/*
* George Westfall
* CIS255
* File: Repeat.java
* Project: Homework 5
// Write a Java class Repeat which accepts a string and an integer as input. The number of times the
// string is output to the screen should equal the integer value. Use java.util.Scanner and
// System.out.println() for input and output respectively. (Use for loop)
*/

import java.util.Scanner;

public class Repeat {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // create scanner for input
        Scanner in = new Scanner(System.in);

        // declare variables
        int counter = 0;

        System.out.print("Enter a string: ");
        String phrase = in.next();

        System.out.print("Enter a positive integer: ");
        counter = in.nextInt();

        for (int i = 0; i < counter; i++) {
            System.out.println(phrase);
        }

        in.close();
    }

}

