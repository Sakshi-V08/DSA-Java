package Array;
import java.util.Scanner;

public class Array_2 {
    public static int extraBinarySearch(int numbers[], int key) {

        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Return -1 to indicate that the key is not found
    }

    public static void search(int numbers[], int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.print(i + " "); // Print the index
            }
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 6, 8, 9, 10, 12 };
        int key = 12;
        int target = 10;
        int index = extraBinarySearch(numbers, key);

        if (index != -1) {
            System.out.println("Key found at index: " + index);

            System.out.print("Print enter the index: ");
            Scanner sc = new Scanner(System.in);
            int userIndex = sc.nextInt();

            if (userIndex >= 0 && userIndex < numbers.length) {
                for (int i = userIndex; i < numbers.length; i++) {
                    System.out.print(numbers[i] + " ");
                }
                for (int i = 0; i < userIndex; i++) {
                    System.out.print(numbers[i] + " ");
                }
            } else {
                System.out.println("Invalid index entered.");
            }
        } else {
            System.out.println("Key not found in the array.");
        }
        search(numbers, target);
    }
}
