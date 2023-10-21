public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void sort(int arr[]) {
        int n = arr.length;
        int count = 0;
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = 0; j < n; j++) {
                if (curr > arr[j]) {
                    count++;
                }
            }
            arr1[i] = count;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 7, 7, 7, 7, 7 };
        sort(arr);
    }

}