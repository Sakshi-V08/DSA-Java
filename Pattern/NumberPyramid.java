import java.util.Scanner;

public class NumberPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Blank space before pyramid
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // pyramid line
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j != i) {
                    System.out.print(" ");
                }
            }
             
            // blank spaces after pyramid
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
