import java.util.*;

public class Bubble_Sort {

    public static void bubbleSort(int arr[]) {
          
        for (int turn = 0; turn < arr.length - 1; turn++) {  
                int swap=0;  //O(n^2)
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
           System.out.println(" Number of swap in each iteration "+turn+ ":" +swap);
        }
          
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] ={3, 6, 2, 1, 8, 7, 4, 5, 3, 1 } ;
        bubbleSort(arr);
        printArr(arr);
        
    }

}
