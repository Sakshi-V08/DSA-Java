import java.util.Scanner;

public class SolidRhombusPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1, i, ispace = n, star = n;
        while (l <= n) {
            for (i = 1; i <= ispace; i++) {
                System.out.print(" ");
            }
            for (i = 1; i <= star; i++) {
                System.out.print("*");
            }

            System.out.println();
            ispace--;

            l++;
        }

    }
}
