package Recursion;

public class FirstOccurance {
    public static int firstOccurance(int arr[], int key, int i) {
        //base case
        if (i == arr.length - 1) {
            return -1;

        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }
    public static void main(String args[]) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.println("Index: "+ firstOccurance(arr,key,0));

    }

}
