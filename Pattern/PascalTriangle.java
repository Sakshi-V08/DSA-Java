import java.util.*;

public class PascalTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int p = 1;
            
            // Print spaces for formatting
            for (int k = 0; k < r - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" " + p + " ");
                p = p * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

