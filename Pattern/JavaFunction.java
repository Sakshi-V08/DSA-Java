public class JavaFunction {
    // Find the factorial
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    // Find Binomial Coeffient
    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);
        int bin = (n_fact) / (r_fact * nmr_fact);
        return bin;

    }

    // Prime Number only for n>2
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    // Print all Primes in a Range
    public static void PrimeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Convert frome Binary to Decimal
    public static void binarytoDecimal(int n) {
        int pow = 0, dec = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            n = n / 10;
        }
        System.out.print("decimal number is = " + dec);
    }

    // Convert from Decimal to Binary
    public static void decimaltoBinary(int n) {
        int pow = 0, bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.print("binary number is = " + bin);
    }

    public static void main(String args[]) {
        decimaltoBinary(15);

    }

}
