import java.util.Scanner;

public class HollowRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            // Print trailing spaces
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            // Print stars after spaces
            // Print stars for each solid rows
            if (i == 1 || i == n)
                for (j = 1; j <= n; j++)
                    System.out.print("*");

            // stars for hollow rows
            else
                for (j = 1; j <= n; j++)
                    if (j == 1 || j == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            // Move to the next line/row
            System.out.println();

        }
    }
}
