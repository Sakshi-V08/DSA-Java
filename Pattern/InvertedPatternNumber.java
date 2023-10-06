import java.util.Scanner;

public class InvertedPatternNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1, stars = n, space = l, i;
        while (l <= n) {
            for (i = 1; i <= stars; i++) {
                System.out.print(i + " ");
            }
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            stars--;
            l++;
            System.out.println();
        }
    }
}
