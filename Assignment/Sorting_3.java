public class Sorting_3 {
    // Insertion Sorting
    public static void insertionSort(int arr[]) { // Assume first element is already sorted in array so loop start from
                                                  // 1 that means pick an element (from unsorted part) & placed in the
                                                  // right pos in sorted arr(left side of the array)
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        insertionSort(arr);

        printArr(arr);

    }

}
