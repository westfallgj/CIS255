/*
* George Westfall
* CIS255
* File: ExampleHmWk9Q2.java

Write a Java class HmWk9Q2, which accepts an input argument when the application is executed from the command-line. Add the method reverse(s) which accepts a string as a parameter and returns the string reversed by using the standard charAt() String method.

*/

public class ExampleHmWk9Q2 {
    public static void main(String[] args) {

        // get the command line argument
        String inputString = args[0];

        // call the reverseString method
        String reversed = reverseString(inputString);

        // print output
        System.out.println("The input string is: " + inputString);
        System.out.println("The reverse string is: " + reversed);

    }

    public static String reverseString(String s) {
        
        // new var to hold the reversed string
        String reverseString = "";

        // use length minus 1 to the correct index
        for (int i = s.length() - 1; i >= 0; i--)  {
            // add the individual characters to the reversed string
            reverseString = reverseString  + s.charAt(i);
        }

        // return the reversed string
        return reverseString;

    }
}
