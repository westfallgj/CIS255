/*
* George Westfall
* CIS255: Project #8
* File: ExampleProject8Q2.java
* 
* Write a Java class ExampleProject8Q2, that has the method addAicraft(id, 
* make, model, tailNumber) which stores each aircraft's information from the 
* table above into the custom Aircraft object class created in Question #1 and 
* then add the Aircraft object to a LinkedList. Create a second method  
* showAircrafts() that displays all the aircraft's information in each element 
* of the LinkedList using the toString() method for each Aircraft object. The 
* main() method should call the addAircraft() method for each aircraft and call 
* showAircrafts() after all aircrafts have been added.
*/

import java.util.LinkedList;
import java.util.List;

public class ExampleProject8Q2 {
    
    private static List<Aircraft> aircrafts;
    public static void main(String[] args) {
        
        aircrafts = new LinkedList<Aircraft>();

        addAircraft("63", "Cessna", "C153","N95556");
        addAircraft("65", "Cessna", "C182R","N736ZX");
        addAircraft("70", "Piper", "P28R","N29RM");
        addAircraft("80", "Cessna", "C172","N984SP"); 

        System.out.println("--- List of Aircraft ---");
        showAircrafts();

    }

    public static void addAircraft(String id, String make, String model, String tailNumber)  {
        Aircraft aircraft = new Aircraft(id, make, model, tailNumber);
        aircrafts.add(aircraft);
    }

    public static void showAircrafts() {
        for (Aircraft aircraft: aircrafts)  {
            System.out.println(aircraft);
        }
    }
}
