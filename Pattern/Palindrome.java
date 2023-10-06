import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (n == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Number: " + num + " is a palindrome");
        } else {
            System.out.println("Number: " + num + " is not a palindrome");
        }

    }
}
