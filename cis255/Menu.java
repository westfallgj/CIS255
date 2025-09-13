/*
* George Westfall
* CIS255
* File: Menu.java
* Project: 4
*/

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        // init variables
        int choiceInt, inputInt1, inputInt2 = 0;

        // crete new scanner
        Scanner in = new Scanner(System.in);

        // print menu
        displayMenu();
        choiceInt = in.nextInt();

        // cycle through output choices based on input
        switch (choiceInt) {
            case 1:
                System.out.print("Enter an integer:");
                inputInt1 = in.nextInt(); 
                System.out.print("The incremented number is: " + (inputInt1 + 1));               
                break;
            case 2:
                System.out.print("Enter an integer:");
                inputInt1 = in.nextInt(); 
                if (inputInt1 % 2 == 0)
                    System.out.print("The number is even.");
                else
                    System.out.print("The number is odd.");
                break;
            case 3:
                System.out.print("Enter an integer:");
                inputInt1 = in.nextInt(); 
                System.out.print("The decremented number is: " + (inputInt1 - 2));   
                break;
            case 4:
                System.out.print("Enter an integer:");
                inputInt1 = in.nextInt(); 
                System.out.print("Enter another integer:");
                inputInt2 = in.nextInt();                 
                System.out.print("The sum of the two numbers is: " + (inputInt1 + inputInt2));
                break;
            default:
                System.out.println("That is a invalid menu option!");            
                break;
        }
        
        // close scanner
        in.close();
    }
 
    public static void displayMenu() {
        System.out.println("*****************************************");
        System.out.println("*              MENU                     *");
        System.out.println("*****************************************");
        System.out.println("* 1 - Increment a number by 1.          *");
        System.out.println("* 2 - Check if a number is odd or even. *");
        System.out.println("* 3 - Decrement a number by 1.          *");
        System.out.println("* 4 - Sum 2 numbers.*                   *");
        System.out.println("*****************************************");
        System.out.println();
        System.out.print("Enter your menu selection: ");
    }
}
