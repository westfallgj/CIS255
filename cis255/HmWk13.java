/*
* George Westfall
* CIS255
* File: HMwK.java
* Project: Homework 13
*
* Write the Java class HmWk13 to test the classes that implement the Animal interface. 
* HmWk12 should create at least 1 Cow object, 1 Chicken object, and 1 Pig object. Each 
* animal should be stored into an Animal List object after creating. Afterward loop through 
* the list and execute the interface methods sound() and type().
*
*/

import java.util.ArrayList;
import java.util.List;

public class HmWk13 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();

        Animal cow = new Cow();
        Animal chicken = new Chicken();
        Animal pig = new Pig();



        animals.add(cow);
        animals.add(chicken);
        animals.add(pig);


        for (Animal a: animals)  {
            System.out.println(
                a.type() + ": " + a.sound());
        }
    }

}
