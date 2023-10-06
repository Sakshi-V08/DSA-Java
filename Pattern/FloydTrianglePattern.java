import java.util.Scanner;

public class FloydTrianglePattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, a = 1;
        for (i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println(" ");

        }
        sc.close();
    }
}