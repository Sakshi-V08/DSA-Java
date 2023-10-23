public class TwoDArray_1 {

    //Print the number of 7’s that are inthe 2d array
    public static int countElement(int arr[][], int key) {
        int row = 0;
        int col = 0;
        int count = 0;

        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[0].length; col++) {
                if (key == arr[row][col]) {
                    count++;
                }

            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 8;
        System.out.println(countElement(arr, key));
    }

}
