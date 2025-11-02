public class Homework8Notes {
    public static void main(String[] args) {
        
        int theList[] = new int[9];
        
        theList[0] = 0;
        theList[1] = 5;
        theList[2] = 10;
        theList[3] = 15;
        theList[4] = 20;
        theList[5] = 15;
        theList[6] = 10;
        theList[7] = 5;
        theList[8] = 0;

        System.out.println("The difference is: " + aDiff(theList));
        System.out.println("The number of zeros in the array is: " + aNumZero(theList));
        System.out.println("The array is not clear: " + aIsNotClear(theList));
        System.out.println("The number more than X is: " + aNumMore(theList, 10));
    }

    public static int aDiff(int list[]) {
        int diff = 0;

        for (int i = 0; i < list.length; i++)  {
            diff -= list[i];
        }
        return diff;
        
    }

    public static int aNumZero(int list[]) {
        int numZero = 0;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] == 0)  {
                numZero += 1;
            }
        }
        return numZero;
        
    }
    
    public static boolean aIsNotClear(int list[]) {
        boolean isNotClear = false;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] != 0)  {
                isNotClear = true;
                break;
            }
        }
        return isNotClear;
        
    }

    public static int aNumMore(int list[], int x) {
        int numMore = 0;

        for (int i = 0; i < list.length; i++)  {
            if(list[i] > x)  {
                numMore++;
            }
        }
        return numMore;
        
    }
}