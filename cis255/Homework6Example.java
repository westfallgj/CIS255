/*
* George Westfall
* CIS255
* File: Notes6Example.java
* Project: Homework 5 Notes
*/

import java.util.Scanner;

public class Homework6Example {
    /**
     * @param args
     */
    public static void main(String[] args) {

                // create scanner for input
        Scanner in = new Scanner(System.in);
        int alpha;
        int beta;
        int gamma;

        System.out.print("Enter an integer: ");
        alpha = in.nextInt();

        System.out.print("Enter another integer: ");
        beta = in.nextInt();

        System.out.print("Enter last integer: ");
        gamma = in.nextInt();

        showAvg(alpha, beta, gamma);

        in.close();

    }
    
    public static void showAvg(int a, int b, int c) {

        double average = (a + b + c)/ 3.0;

        System.out.println("The average is " + average);
        
    }
}

