public class Diagonal_Sum {
    // n=m diagonal Sum
    public static int diagonalSum(int matrix[][]) { // O(n62)
        int sum = 0;
        // n*m size
        // Summation of primary diagonal
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // }
        // // Summation of secondary diagonal i+j=n-1 (j=n-1-i)
        // else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }

        // }
        for (int i = 0; i < matrix.length; i++) {     //O(n)
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.print(diagonalSum(matrix));
    }

}
