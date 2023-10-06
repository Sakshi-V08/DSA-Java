public class SqaureRoot {
    public static void main(String[] args) {
        int n = 25; // Your input number
        int result = sqrt(n);
        System.out.println(result);
    }

    public static int sqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int left = 1;
        int right = n;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= n / mid) {
                left = mid + 1;
                result = mid; // Update the result with the current mid if it's smaller or equal
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
