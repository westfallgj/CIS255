/*
* George Westfall
* CIS255
* File: VolumeBoxCalc.java
*/

public class VolumeBoxCalc {
        public static void main(String[] args) {
            //declare variables
            final int length = 8, width = 3, height = 4;
            int volume = 0;
            
            // formula is length x width x height = volume
            volume = length * width * height;
            
            // print output
            System.out.println("The volume of the box is " + volume);
    }    
}
