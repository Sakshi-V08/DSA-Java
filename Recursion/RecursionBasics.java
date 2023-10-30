package Recursion;

public class RecursionBasics {

// Decreasing Order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
        } else {
            System.out.print(n + " ");
            printDec(n - 1);
        }
    }

    // Increasing Order
     public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n+" ");
        } else {
            printInc(n-1);
            System.out.print(n+" ");
           
        }
    }
    

    public static void main(String args[]) {
        int n = 10;
        printDec(n);
        System.out.println();
        printInc(n);
    }

}
