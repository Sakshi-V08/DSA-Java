import java.util.Scanner;

public class InvertedRotatedHalfPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1, spaces = n - 1, stars = l, i;
        while (l <= n) {
            for (i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            for (i = 1; i <= l; i++) {
                System.out.print("*");
            }
            spaces--;
            l++;
            System.out.println();
        }

    }
}