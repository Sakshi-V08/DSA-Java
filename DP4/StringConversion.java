package DP4;

public class StringConversion {
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // initialize
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j]=0;
            }
        }
        // bottom up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i][j - 1];
                    int ans2 = dp[i - 1][j];

                    dp[i][j]= Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static int stringConversion(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int sum = 0;

        int l=lcs(str1, str2);
        sum = (n-l)+(m-l);

        return sum;
    }

    public static void main(String args[]) {
        String str1 = "abcdef";
        String str2 = "acdeg";  // lcs = acde

        System.out.println("String Conversion is: "+stringConversion(str1, str2));
    }

}
