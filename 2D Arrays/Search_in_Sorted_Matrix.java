public class Search_in_Sorted_Matrix {
    public static boolean stairSearch(int matrix[][], int key) {
        // All the element are sorted in phase , row and column vise both
       // it start from top right corner

        // int row = 0, col = matrix[0].length - 1;
        // while (row < matrix.length && col >= 0) {
        //     if (matrix[row][col] == key) {
        //         System.out.print("Found key at (" + row + "," + col + ")");
        //         return true;
        //     } else if (key < matrix[row][col]) {
        //         col--;
        //     } else {
        //         row++;
        //     }
        // }
        // System.out.println("Key is not found.");
        // return false;


        // it start from bottom left corner
        int row = matrix.length-1, col = 0;
        while (row >=0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.print("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Key is not found.");
        return false;

    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        stairSearch(matrix, key);
    }

}
