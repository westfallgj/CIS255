/*
* George Westfall
* CIS255
* File: ExampleHmWk9Q2.java

Write an interactive Java class HmWk9Q3, which accepts an input argument when the application is executed from the command-line. Accept input from the user and compare the value entered to the command-line argument value. If the strings do not equal, display "INVALID VALUE! TRY AGAIN!", otherwise display "PERMISSION GRANTED!" and exit the program.

*/

import java.util.Scanner;

public class ExampleHmWk9Q3 {
    public static void main(String[] args) {

        // create a scanner and needed string var
        Scanner in = new Scanner(System.in);
        String userString = "";
        
        // get the command line argument
        String commandLineString = args[0];

        // prompt user for input continuously until correct
        do  {
            System.out.print("Please enter a string: ");
            userString = in.nextLine();
            
            // check if the 2 strings are equal, if so break loop
            if ( commandLineString.equalsIgnoreCase(userString))  {
                System.out.println("PERMISSION GRANTED!");
                break;
            // else continue prompting user
            } else  {
                System.out.println("INVALID VALUE! TRY AGAIN!");
            }
        } while(true);

        // cleanup 
        in.close();
    }
}
