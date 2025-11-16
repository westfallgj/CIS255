/*
* George Westfall
* CIS255, Homework 12
* File: Pilot.java
*
* Write a Java class Pilot that that extends the Person object. Add the member variables grade as a string (i.e. Recreational, 
* Private, Commercial, and ATP), isCurrent as a boolean, and numHours as an integer. Override the play() method to output "I 
* cannot play! I am boarding the plane...", and override the talk() method to output "Redstone Traffic, Cessana Niner Seven 
* Niner One Foxtrot taxiing to runway 35!". Add the method takeoff() which outputs the string "Redstone Traffic, Cessana Niner 
* Seven Niner One Foxtrot departing 35". Add another method landing() which outputs the string "Redstone Traffic, Cessana Niner 
* Seven Niner One Foxtrot final runway 17 full stop". The Pilot object class should override the toString() method and display 
* all variables (including the inherited ones).
*
*/

public class Pilot extends Person {
    private String grades;
    private boolean isCurrent;
    private int numHours;

    public Pilot()  {

    }

    public Pilot(String name, int age, String grades, boolean isCurrent, int numHours) {
        super(name, age);
        this.grades = grades;
        this.isCurrent = isCurrent;
        this.numHours = numHours;
    }

    @Override
        public void play() { System.out.println("I cannot play! I am boarding the plane...");
    }

    @Override
    public void talk() {
        System.out.println("Redstone Traffic, Cessana Niner Seven Niner One Foxtrot taxiing to runway 35!");
    }

    public void takeOff()  {
        System.out.println("Redstone Traffic, Cessana Niner Seven Niner One Foxtrot departing 35");
    }

    public void landing()  {
        System.out.println("Redstone Traffic, Cessana Niner Seven Niner One Foxtrot final runway 17 full stop");
    }
    public String getGrades() {
        return grades;
    }

    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public int getNumHours() {
        return numHours;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void setIsCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public void setNumHours(int numHours) {
        this.numHours = numHours;
    }

    @Override
    public String toString() {
        return "Pilot [name=" + name + ", age=" + age + ", grades=" + grades + ", isCurrent=" + isCurrent
                + ", numHours=" + numHours + "]";
    }

}
