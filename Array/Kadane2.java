public class Kadane2 {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        // Check if all elements in the array are negative
        boolean allNegative = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                allNegative = false;
                break;
            }
        }

        if (allNegative) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] < 0) {
                    cs = cs + numbers[j];
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("Maximum subaaray sum is :" + ms);
        } else {
            for (int i = 0; i < numbers.length; i++) {
                cs = cs + numbers[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("Our max subarray sum is: " + ms);
        }
    }

    public static void main(String args[]) {
        int numbers[] = { -1, -2, -3,2,4,5,6,7, -4 };
        kadanes(numbers);
    }
}
