public class Spiral_Matrix_2 {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int num = 1;
            int startRow = 0;
            int startCol = 0;
            int endRow = n - 1;
            int endCol = n - 1;
    
            while (startRow <= endRow && startCol <= endCol) {
                // Fill the top row
                for (int j = startCol; j <= endCol; j++) {
                    matrix[startRow][j] = num++;
                }
                startRow++;
    
                // Fill the rightmost column
                for (int i = startRow; i <= endRow; i++) {
                    matrix[i][endCol] = num++;
                }
                endCol--;
    
                // Fill the bottom row if there are more than one row
                if (startRow <= endRow) {
                    for (int j = endCol; j >= startCol; j--) {
                        matrix[endRow][j] = num++;
                    }
                    endRow--;
                }
    
                // Fill the leftmost column if there are more than one column
                if (startCol <= endCol) {
                    for (int i = endRow; i >= startRow; i--) {
                        matrix[i][startCol] = num++;
                    }
                    startCol++;
                }
            }
    
            return matrix;
        }
    
        public static void main(String[] args) {
            Spiral_Matrix_2 solution = new Spiral_Matrix_2();
            int n = 3; // Change the value of n as needed
    
            int[][] result = solution.generateMatrix(n);
    
            System.out.println("Generated Matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        
    }
    
    
}
