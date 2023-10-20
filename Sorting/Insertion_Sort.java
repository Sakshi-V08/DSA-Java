import java.util.*;
import java.util.Collections;
public class Insertion_Sort {
    public static void insertionSort(int arr[]) {      //O(n^2)
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = { 5, 3, 8, 4, 2, 1 };
        //insertionSort(arr);
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        printArr(arr);
    }

}
