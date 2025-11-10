/*
* George Westfall
* CIS255: Project #8
* File: ExampleProject8Q3.java
* 
* Write a an interactive Java class ExampleProject8Q3, that will display a menu with the available
* commands 'G', 'D', and 'X'. If 'G' is selected, prompt the user for the ID of a aircraft to display to
* the screen. If 'D' is selected, display all the values in the LinkedHashMap to the user with their
* associated LinkedHashMap key. If 'X' is selected, exit the program. The class should have the
* method addAircraft(id, make, model, tailNumber) which stores each aircraft's information from
* the table above into a custom Aircraft object class and then into a LinkedHashMap using the ID of
* the aircraft for the key. Create a second method showAircrafts() that displays all the aircraft's
* information in each element of the LinkedHashMap. Finally create a third method showAircraft()
* that displays the aircraft's information for the ID entered by the user.
*
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleProject8Q3 {
    
    private static Map<String, Aircraft> aircrafts;
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String choice;

        loadAircrafts();

        System.out.println("Welcome to the aircraft database.\n");

        do {
            System.out.println("*********************************************\n");
            System.out.println("*    Aircraft Datebase                      *\n");
            System.out.println("*********************************************\n");
            System.out.println("* G - Get an aircraft's information         *\n");
            System.out.println("* D - Display all  aircraft's information   *\n");
            System.out.println("* X - Exit the program                      *\n");
            System.out.println("*********************************************\n");
            
            System.out.println("Enter your selection: ");

            choice = in.nextLine();

            if (choice.equalsIgnoreCase("G"))  {
                System.out.println("Enter aircraft ID: ");
                showAircraft(in.nextLine());
            } else if (choice.equalsIgnoreCase("D"))  {
                showAircrafts();
            } else if (choice.equalsIgnoreCase("X"))  {
                System.out.println("\n Thank you!");
            } else  {
                System.out.println("\n Invalid Selection! Try again!");
            }

        } while(!choice.equalsIgnoreCase("X"));

        in.close();
    }

    public static void loadAircrafts()  {

        aircrafts = new LinkedHashMap<String, Aircraft>();

        addAircraft("63", "Cessna", "C153","N95556");
        addAircraft("65", "Cessna", "C182R","N736ZX");
        addAircraft("70", "Piper", "P28R","N29RM");
        addAircraft("80", "Cessna", "C172","N984SP"); 

    }

    public static void addAircraft(String id, String make, String model, String tailNumber)  {
        Aircraft aircraft = new Aircraft(id, make, model, tailNumber);

        aircrafts.put(id, aircraft);
    }

    public static void showAircrafts() {
        
        System.out.println();

        for (String key: aircrafts.keySet())  {
            System.out.println(aircrafts.get(key));
        }
        System.out.println();

    }

    public static void showAircraft(String id) {
        
        Aircraft aircraft = aircrafts.get(id);

        if (aircraft != null)  {
            System.out.println("\n" + aircraft + "\n");
        } else  {
            System.out.println("Invalid aircraft ID\n");
        }
    }
}

