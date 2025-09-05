/*
* George Westfall
* CIS255
* File: Quest1.java
*/

public class Quest1  {
    public static void main(String args[]) {
        final float PRICE_PER_SQUARE_FOOT = 13.99f;
        int length1, _width, Area;
        float totalPrice;
        length1 = 15;
        _width = 8;

        Area = length1 * _width;
        totalPrice = Area * PRICE_PER_SQUARE_FOOT;

        System.out.println("The total cost is $" + totalPrice);
        }
}
