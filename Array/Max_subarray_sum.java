public class Max_subarray_sum {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    // Subarray Sum
                    currSum += numbers[k];
                }
                System.out.println();
                System.out.println("Current Sum is : "+currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("Max Sum = " + maxSum);

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubarraySum(numbers);

    }

}
//Takes less time complexity
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currSum = nums[0];
//         int maxSum = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             // Choose the maximum between the current element and the sum so far plus the current element
//             currSum = Math.max(nums[i], currSum + nums[i]);
            
//             // Update the maximum subarray sum
//             maxSum = Math.max(maxSum, currSum);
//         }

//         return maxSum;
//     }
// }
