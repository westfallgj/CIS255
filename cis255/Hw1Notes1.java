/*
* George Westfall
* CIS255
* File: Hw1Notes1.java
*/

public class Hw1Notes1 {
    public static void main(String args[]) {
        final float DISCOUNT_RATE = 0.1f;
        int listPrice;
        float salePrice;
        
        listPrice = 10;
        salePrice = listPrice - (listPrice * DISCOUNT_RATE);
        
        System.out.println("The sale price is $" + salePrice);
        }
}