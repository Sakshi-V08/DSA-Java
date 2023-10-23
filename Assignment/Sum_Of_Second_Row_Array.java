public class Sum_Of_Second_Row_Array {

    //Print out the sum of the numbers inthe second row of the “nums” array
    public static int sumSecondRow(int arr[][]) {
        int sum = 0;

        for (int col = 0; col < arr[0].length; col++) {
            sum += arr[1][col];
        }

        return sum;

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(sumSecondRow(arr));
    }

}
