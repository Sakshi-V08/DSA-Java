package DP5;

public class CatalanTabu {
    // O(n*n)
    public static int catalanTabo(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) { // Ci
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1]; // Ci = Cj * Ci-j-1
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(catalanTabo(4));

    }
}
