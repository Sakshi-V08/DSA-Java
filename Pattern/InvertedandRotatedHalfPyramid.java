import java.util.Scanner;

public class InvertedandRotatedHalfPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, spaces = n - 1, star = 1;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces -= 1;
            star += 1;

        }

    }
}
