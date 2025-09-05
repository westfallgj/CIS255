/*
* George Westfall
* CIS255
* File: Project2.java
* Write the Java class Project2 that computes and prints the cost of a quantity of 5 items at unit price,
* $1.98, with a 4% sales tax (5 point bonus - set precision of the total price to 2 digits).
*/


public class Project2 {
    
    public static void main(String[] args) {

        // declare variables
        final float salesTax = 0.04f, itemCost = 1.98f;
        int numOfItems = 5;
        float totalPrice = 0;

        totalPrice = (numOfItems * itemCost) + ((numOfItems * itemCost) * salesTax);

        // print output to 2 digits
        System.out.printf("The total cost is %.2f",  totalPrice);
    }
}
