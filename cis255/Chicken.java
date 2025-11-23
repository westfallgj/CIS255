/*
* George Westfall
* CIS255
* File: Chicken.java
* Project: Homework 13
*
* Write a Java class Chicken that that implements the Animal interface. Add the member variables 
* for type and sound. Create the default constructor method which sets the member variable type 
* to be "chicken" and the member variable sound = "cluck". Handle the sound() and type() methods 
* as intended.
*
*/

public class Chicken implements Animal{
    private String type;
    private String sound;

    public Chicken() {
        type = "chicken";
        sound = "cluck";
    }

    public String type()  {
        return type;
    }

    public String sound()  {
        return sound;
    }
}
