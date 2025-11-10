/*
* George Westfall
* CIS255: Project #8
* File: Project8Q2.java.java
*
* Write a Java class Project8Q2, that has the method addPresident(id, lastName, firstName, middleInitial) 
* which stores each president's information from the table above into the custom President object class 
* created in Question #1 and then add the President object to a LinkedList. Create a second method 
* showPresidents() that displays all the president's information in each element of the LinkedList using the 
* toString() method for each President object. The main() method should call the addPresident() method for 
* each president and call showPresidents() after all presidents have been added.
*
*/

import java.util.LinkedList;
import java.util.List;

public class Project8Q2 {
    
    private static List<President> presidents;
    public static void main(String[] args) {
        
        presidents = new LinkedList<President>();

        addPresident("16", "Lincoln", "Abraham", null);
        addPresident("18", "Grant", "Ulysses","S");
        addPresident("26", "Roosevelt", "Theodore",null);
        addPresident("27", "Taft", "William","H"); 
        addPresident("29", "Harding", "Warren","G"); 

        System.out.println("--- List of Aircraft ---");
        showAPresidents();
    }

    public static void addPresident(String id, String lastName, String firstName, String middleInitial)  {
        President president = new President(id, lastName, firstName, middleInitial);
        presidents.add(president);
    }

    public static void showAPresidents() {
        for (President president: presidents)  {
            System.out.println(president);
        }
    }
}
