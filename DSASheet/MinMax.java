package DSASheet;

public class MinMax {
    public static void minMax(int nums[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {

                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String args[]) {
        int[] nums = { 22, 14, 8, 17, 35, 3 };
        minMax(nums);
    }

}
