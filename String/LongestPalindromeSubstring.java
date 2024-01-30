public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0 || s == null) {
            return "";
        }
        if (n < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
          
            int len1 = expandAroundCenter(s, i, i);
          
            int len2 = expandAroundCenter(s, i, i + 1);

            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromeSubstring solution = new LongestPalindromeSubstring();
        String s = "babad";
        System.out.println(solution.longestPalindrome(s)); // Output: "bab" or "aba"
    }
}

