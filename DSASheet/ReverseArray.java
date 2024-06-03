package DSASheet;

public class ReverseArray {
    public static void reverseArray(int arr[]){
        int n= arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }
        for(int i= 0 ;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,3};
        reverseArray(arr);
    }
}
