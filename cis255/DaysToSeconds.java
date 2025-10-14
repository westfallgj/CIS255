
/* 
* Jim Smith
* File: DaysToSeconds.java
*/

import java.util.Scanner;

public class DaysToSeconds {
    public static void main(String args) {

        Scanner in = new Scanner(System.in);
        final int HOURS_IN_DAY = 24;
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_MINUTE = 60;
        int secondsInDay = HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
        double totalDays = 0.0;
        double totalSeconds = 0.0;

        System.out.print("Enter the number of days to convert to seconds: ")
        totalDays = in.nextDouble();
        totalSeconds = totalDays * secondsInDay;
        System.out.print(totalDays + " days is equal to ");
        System.out.println(totalSeconds + " seconds.");
    }
}


    
}
