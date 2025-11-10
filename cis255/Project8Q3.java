/*
* George Westfall
* CIS255: Project #8
* File: Project8Q3.java
* 
* Write an interactive Java class Project8Q3, that will display a menu with the available commands 'G', 'D', and 'X'. If 'G' is selected, 
* prompt the user for the ID of a president to display to the screen and then display the president's information. If 'D' is selected, 
* display all the values in the LinkedHashMap to the user with their associated LinkedHashMap key. If 'X' is selected, exit the program. 
* The class should have the method addPresident(id, lastName, firstName, middleInitial) which stores each president's information from the 
* table above into a custom President object class and then into a LinkedHashMap using the ID of the president for the key. Create a second 
* method showPresidents() that displays all the president's information in each element of the LinkedHashMap. Finally create a third method 
* showPresident() that displays the president's information for the ID entered by the user.
*
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Project8Q3 {
    
    private static Map<String, President> presidents;
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String choice;

        loadPresidents();

        System.out.println("Welcome to the president database.\n");

        do {
            System.out.println("*********************************************\n");
            System.out.println("*    Presidents Database                      *\n");
            System.out.println("*********************************************\n");
            System.out.println("* G - Get a President's information         *\n");
            System.out.println("* D - Display all  President's information   *\n");
            System.out.println("* X - Exit the program                      *\n");
            System.out.println("*********************************************\n");
            
            System.out.println("Enter your selection: ");

            choice = in.nextLine();

            if (choice.equalsIgnoreCase("G"))  {
                System.out.println("Enter president ID: ");
                showPresident(in.nextLine());
            } else if (choice.equalsIgnoreCase("D"))  {
                showPresidents();
            } else if (choice.equalsIgnoreCase("X"))  {
                System.out.println("\n Thank you!");
            } else  {
                System.out.println("\n Invalid Selection! Try again!");
            }

        } while(!choice.equalsIgnoreCase("X"));

        in.close();
    }

    public static void loadPresidents()  {

        presidents = new LinkedHashMap<String, President>();

        addPresident("16", "Lincoln", "Abraham", null);
        addPresident("18", "Grant", "Ulysses","S");
        addPresident("26", "Roosevelt", "Theodore",null);
        addPresident("27", "Taft", "William","H"); 
        addPresident("29", "Harding", "Warren","G"); 

    }

    public static void addPresident(String id, String make, String model, String tailNumber)  {
        President president = new President(id, make, model, tailNumber);

        presidents.put(id, president);
    }

    public static void showPresidents() {
        
        System.out.println();

        for (String key: presidents.keySet())  {
            System.out.println(presidents.get(key));
        }
        System.out.println();

    }

    public static void showPresident(String id) {
        
        President president = presidents.get(id);

        if (president != null)  {
            System.out.println("\n" + president + "\n");
        } else  {
            System.out.println("Invalid President ID\n");
        }
    }
}

