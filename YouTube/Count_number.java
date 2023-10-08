import java.util.Scanner;

public class Count_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == k) {
                count++;
            }
            n = n / 10;

        }
        System.out.print("N0. of count in the integer "+ k+ ": " + count);

    }

}
