/*
* George Westfall
* CIS255
* File: Homework 8
*
1. Write the method aSum(int list[]) which returns the sum of the data values in array theList.
2. Write the method aNumPos(int list[]) which returns the number of positive data values in array
theList.
3. Write the method aSumNeg(int list[]) which returns the sum of the negative data values In array
theList.
4. Write the method aMin(int list[]) which returns the smallest data value in array theList.
5. Write the method aIsClear(int list[]) which returns true if all data values in array theList are equal
to zero, false otherwise.
6. Write the method aIsThere(int list[], int t) which returns true if target value t is in array theList,
false otherwise.
7. Write the method aNumLess(int list[], int x) which returns the number of data values in array
theList which are less than value x.
*/

public class Homework8 {
    public static void main(String[] args) {
        
        int theList[] = new int[4];

        theList[0] = 1;
        theList[1] = -7;
        theList[2] = 10;
        theList[3] = 23;

        System.out.println("The sum of all the data values is: " + aSum(theList));
        System.out.println("The number of positive values in the array is: " + aNumPos(theList));
        System.out.println("The sum of negative values in the array is: " + aSumNeg(theList));
        System.out.println("The smallest value in the array is: " + aMin(theList));
        System.out.println("The array is clear: " + alsClear(theList));
        System.out.println("The value X is in the array: " + alsThere(theList, 10));
        System.out.println("The number of values less than X is: " + aNumLess(theList, 10));

    }

    /**
     * Calculates the sum of all integer data values in the given array.
     */
    public static int aSum(int list[]) {
        int arraySum = 0;

        for (int i = 0; i < list.length; i++)  {
            arraySum += list[i];
        }
        return arraySum;
        
    }

    /**
     * Counts the number of positive integer data values (greater than 0) in the given array.
     */
    public static int aNumPos(int list[]) {
        int numPos = 0;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] > 0)  {
                numPos += 1;
            }
        }
        return numPos;
        
    }
    
    /**
     * Calculates the sum of all negative integer data values (less than 0) in the given array.
     */
    public static int aSumNeg(int list[]) {
        int sum = 0;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] < 0)  {
                sum += list[i];
            }
        }
        return sum;
        
    }

    /**
     * Finds the smallest integer data value in the given array.
     */
    public static int aMin(int list[]) {
        int minNum = 0;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] < minNum)  {
                minNum = list[i];
            }
        }
        return minNum;
        
    }

    /**
     * Checks if all data values in the array are equal to zero.
     */
    public static boolean alsClear(int list[]) {
        boolean isClear = false;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] != 0)  {
                break;
            } else  {
                isClear = true;
            }
        }
        return isClear;
        
    }

    /**
     * Checks if a target value is present in the array.
     */
    public static boolean alsThere(int list[], int x) {
        boolean isThere = false;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] > x)  {
                isThere = true;
                break;
            }
        }
        return isThere;
        
    }

    /**
     * Counts the number of elements in the array that are less than a specified value 'x'.
     */
    public static int aNumLess(int list[], int x) {
        int total = 0;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] < x)  {
                total++;
            }
        }
        return total;
        
    }
}