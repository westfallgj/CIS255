/*
* George Westfall
* CIS255
* File: Hw1Notes3.java
*/


public class Hw1Notes3 {
    public static void main(String args[]) {
        final float PI = 3.14f;
        int radius, height;
        float cylinderVol;
        radius = 10;
        height = 5;
        
        cylinderVol = radius * radius * height * PI;

        System.out.println("The cylinder volume is " + cylinderVol);
    }
}
