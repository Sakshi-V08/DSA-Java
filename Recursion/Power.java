package Recursion;

public class Power {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1= power(x,n-1);
        // int xn=x * xnm1;
        // return xn;
        return x * power(x, n - 1);
    }

    public static int optimzedpower(int x, int n) {   //O(logn)
        if (n == 0) {
            return 1;
        }
        int halfPowerSq = optimzedpower(x, n/2);
        halfPowerSq = halfPowerSq*halfPowerSq;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));
        System.out.println(optimzedpower(x, n));

    }

}
