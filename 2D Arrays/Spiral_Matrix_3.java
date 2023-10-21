import java.util.*;

public class Spiral_Matrix_3 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // Right, Down, Left, Up

        int numToVisit = rows * cols;
        int currentRow = rStart;
        int currentCol = cStart;
        int steps = 1;
        int stepDirection = 0; // Start by moving right
        int resultIndex = 0;

        while (numToVisit > 0) {
            for (int i = 0; i < steps; i++) {
                if (currentRow >= 0 && currentRow < rows && currentCol >= 0 && currentCol < cols) {
                    result[resultIndex][0] = currentRow;
                    result[resultIndex][1] = currentCol;
                    resultIndex++;
                    numToVisit--;
                }
                currentRow += directions[stepDirection][0];
                currentCol += directions[stepDirection][1];
            }
            
            // Change direction (right -> down -> left -> up)
            stepDirection = (stepDirection + 1) % 4;

            // Increase steps every two directions (right and left, down and up)
            if (stepDirection % 2 == 0) {
                steps++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Spiral_Matrix_3 solution = new Spiral_Matrix_3();
        Scanner scanner = new Scanner(System.in);

        int rows = 3;
        int cols = 3;
        int rStart = 0;
        int cStart = 0;

        int[][] result = solution.spiralMatrixIII(rows, cols, rStart, cStart);

        System.out.println("Spiral Matrix Coordinates:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("(" + result[i][0] + ", " + result[i][1] + ")");
        }
    }
}

