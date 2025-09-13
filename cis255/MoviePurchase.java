/*
* George Westfall
* CIS255
* File: MoviePurchase.java
* Project: 5
*/

import java.util.Scanner;

public class MoviePurchase {

    public static void main(String[] args) {
        
        // int variables
        final double DVD_PRICE = 14.99;
        final double BLUERAY_PRICE = 19.99;
        final double UHD_PRICE = 26.99;
        final double TAX_RATE = .09;
        
        double subTotal = 0, totalPrice = 0;

        // crete new scanner
        Scanner in = new Scanner(System.in);

        // gather input
        System.out.print("\nDo you want to rent a movie? ");
        char responseChar = in.next().charAt(0);

        // check what the user wanted
        // user didn't want to play
        if ((responseChar == 'N') || (responseChar == 'n'))
            System.out.print("\nWe are sorry that you are not interested.\n");
        // user does want to play
        else {
            // print choices for user and gather input
            System.out.print("\nDVD, Blu-ray, or 4K UHD? [D, B, or U]: ");
            char choiceChar = in.next().charAt(0);

            // see what the user wanted and add the price to the subTotal
            switch (choiceChar) {
                case 'd', 'D':
                    System.out.printf("\nYou added a DVD to your cart for $%.2f.%n", DVD_PRICE);
                    subTotal = subTotal + DVD_PRICE;
                    break;

                case 'b', 'B':
                    System.out.printf("\nYou added a Blue-ray movie to your cart for $%.2f.%n",  BLUERAY_PRICE);
                    subTotal = subTotal + BLUERAY_PRICE;
                    break;
                     
                case 'u', 'U':
                    System.out.printf("\nYou added a 4K USD movie to your cart for $%.2f.%n", UHD_PRICE);
                    subTotal = subTotal + UHD_PRICE;
                    break;
                     
                default:
                    System.out.print("\nYou made an invalid selection!");
                    break;
            }

            // calculate the totalPrice
            totalPrice = subTotal + (subTotal * TAX_RATE);
            
            // print output with subTotal, TAX_RATE, and totalPrice
            System.out.printf("Your cart subtotal is $%.2f.%n", subTotal);
            System.out.printf("After a tax rate of " + TAX_RATE + " percent is added to the subtotal.\n");
            System.out.printf("A charge or $%.2f will be applied to your credit card.\n", totalPrice);

        }

        // say goodbye
        System.out.print("Thank you for shopping. Goodbye.\n\n");

        // close scanner
        in.close();

    }
}