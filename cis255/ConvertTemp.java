/*
* George Westfall
* CIS255
* File: ConvertTemp.java
*/

public class ConvertTemp {
        public static void main(String[] args) {
            // declare variables
            final double tempInFahrenheit = 88.0;
            double tempInCelsius;

            // formula is 𝒄 = (𝟓/𝟗)(𝒇 − 𝟑𝟐)
            // NOTE: I cast to a double to get the correct output. I could
            // also have created a new variable = 5/9
            tempInCelsius = ((double)5/9) * (tempInFahrenheit - 32);
            
            // print output
            System.out.println(tempInFahrenheit + " in Fahrenheit converts to " + tempInCelsius + " degrees Celsius");
    }
}
