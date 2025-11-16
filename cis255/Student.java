/*
* George Westfall
* CIS255, Homework 12
* File: Student.java
*
* Write a Java class Student that that extends the Person object. Add the member variables studentID as an integer, isOnCampus 
* as a boolean, and numClassesTaken as an integer. Override the play() method to output "I cannot play. I am studying...", and 
* override the talk() method to output "No time to talk so stop bothering me!". The Student object class should override the 
* toString() method and display all variables (including the inherited ones).
*
*/

public class Student extends Person {
    protected int studentID;
    protected boolean isOnCampus; 
    protected int numClassesTaken;

    public Student()  {
    }

    public Student(String name, int age, int studentID, boolean isOnCampus, int numClassesTaken) {
        super(name, age);
        this.studentID = studentID;
        this.isOnCampus = isOnCampus;
        this.numClassesTaken = numClassesTaken;
    }

    @Override
    public void play() { 
        System.out.println("I cannot play. I am studying...");
    }

    @Override
    public void talk() {
        System.out.println("No time to talk so stop bothering me!");
    }

    public int getStudentID() {
        return studentID;
    }

    public Boolean getIsOnCampus() {
        return isOnCampus;
    }

    public int getNumClassesTaken() {
        return numClassesTaken;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setIsOnCampus(boolean isOnCampus) {
        this.isOnCampus = isOnCampus;
    }

    public void setNumClassesTaken(int numClassesTaken) {
        this.numClassesTaken = numClassesTaken;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentID=" + studentID + ", isOnCampus=" + isOnCampus
                + ", numClassesTaken=" + numClassesTaken + "]";
    }

}
