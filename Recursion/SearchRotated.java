package Recursion;
// The time complexity of this algorithm is O(log n), which is the same as binary search.
public class SearchRotated {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // kaam
        int mid = si + (ei - si) / 2;

        // case FOUND
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // case b :right
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c:right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // case d :left
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4,5,6,7,0,1,2 };
        int target = 1;
        int tarIdx = search(arr,target, 0, arr.length - 1);
        System.out.print(tarIdx);
    }

}
