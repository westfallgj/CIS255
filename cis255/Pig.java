/*
* George Westfall
* CIS255
* File: Pig.java
* Project: Homework 13
*
* Write a Java class Pig that that implements the Animal interface. Add the member variables 
* for type and sound. Create the default constructor method which sets the member variable 
* type to be "pig" and the member variable sound = "oink". Handle the sound() and type() 
* methods as intended.
*
*/

public class Pig implements Animal{
    private String type;
    private String sound;

    public Pig() {
        type = "pig";
        sound = "oink";
    }

    public String type()  {
        return type;
    }

    public String sound()  {
        return sound;
    }    
}
