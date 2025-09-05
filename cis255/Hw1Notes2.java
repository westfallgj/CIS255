/*
* George Westfall
* CIS255
* File: Hw1Notes2.java
*/

public class Hw1Notes2 {
    public static void main(String args[]) {
        final int NUM_PEOPLE = 3;
        final int INCHES_IN_FOOT = 12;
        int height1, height2, height3;
        float avgHeightInches;
        float avgHeightFeet;
        height1 = 54;
        height2 = 79;
        height3 = 68;

        avgHeightInches = ((height1 + height2 + height3) / NUM_PEOPLE);
        System.out.println("The average height in inches is " + avgHeightInches);
        
        avgHeightFeet = avgHeightInches / INCHES_IN_FOOT;
        System.out.println("The average height in feet is " + avgHeightFeet);
    }
}

