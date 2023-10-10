import java.util.Scanner;

public class Reverse_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans=ans*10+rem;
            
            n = n / 10;

        }
        System.out.print("N0. of count in the integer: " + ans);

    }

}