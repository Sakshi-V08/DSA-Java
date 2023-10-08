public class Subarray_sum_array_equal_k {
    public static int subArray(int nums[], int k) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;

                }
            }
        }
        System.out.print(count);
        return count;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8, 10,15,20,25};
        int k = 8;
        subArray(nums, k);
    }
}
