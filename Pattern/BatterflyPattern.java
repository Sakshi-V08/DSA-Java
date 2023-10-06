import java.util.Scanner;

public class BatterflyPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, l = 1, spaces = 2 * n - 2, stars = l;

        // Print the upper part of the butterfly
        while (l <= n) {
            // Print stars in ascending order
            for (i = 1; i <= stars; i++) {
                System.out.print("* ");
            }

            // Print spaces
            for (i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }

            // Print stars in descending order
            for (i = 1; i <= stars; i++) {
                System.out.print("* ");
            }

            spaces -= 2;
            stars++;
            l++;
            System.out.println();
        }

        // Print the lower part of the butterfly
        l = n;
        spaces = 0;
        stars = n;
        while (l >= 1) {
            // Print stars in ascending order
            for (i = 1; i <= stars; i++) {
                System.out.print("* ");
            }

            // Print spaces
            for (i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }

            // Print stars in descending order
            for (i = 1; i <= stars; i++) {
                System.out.print("* ");
            }

            spaces += 2;
            stars--;
            l--;
            System.out.println();
        }
    }
}
