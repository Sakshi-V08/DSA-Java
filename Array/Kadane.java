public class Kadane {
    // finding maximum subarray sum 
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) { // O(n) time complexity
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray sum is: " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -1, -2, -4, -4 };
        kadanes(numbers);

    }

}
