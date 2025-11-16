/*
* George Westfall
* CIS255, Homework 12
* File: HmWk12.java
*
* Write the Java class HmWk12 to test the Student and Pilot classes written above that inherits the properties of the Person 
* object. HmWk12 should create at least 1 Student object and 1 Pilot object, and then output the values for the student and the 
* pilot to the screen. After displaying the Student object's data, execute the play() and talk() methods. After displaying the 
* Pilot object's data, execute the play(), talk(), takeoff(), and landing() methods.
*
*/

public class HmWk12 {

    public static void main(String[] args) {
        
        // Student object
        String studentName = "Sonny";
        int studentAge = 25;
        int studentID = 1;
        boolean isOnCampus = true;
        int numClassesTaken = 3;
        
        Student studentOne = new Student(studentName, studentAge, studentID, isOnCampus, numClassesTaken);

        System.out.println("Student:\n" + studentOne);
        studentOne.play(); 
        studentOne.talk(); 

        // Pilot object
        String pilotName = "Michael";
        int pilotAge = 21;
        String pilotGrades = "AAAAA....";
        Boolean pilotIsCurrent = false;
        int pilotNumHours = 25;

        Pilot pilotOne = new Pilot(pilotName, pilotAge, pilotGrades, pilotIsCurrent, pilotNumHours);

        System.out.println("Pilot:\n" + pilotOne);
        pilotOne.play();
        pilotOne.talk();
        pilotOne.takeOff();
        pilotOne.landing();

    }
}
