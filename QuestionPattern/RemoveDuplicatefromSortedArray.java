package QuestionPattern;
// tc O(N) and sc O(1) becuase it using same data structure in it.
public class RemoveDuplicatefromSortedArray {
    public static void main(String args[]){
        int nums[] =new int[7];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 2;
        nums[5] = 2;
        nums[6] = 3;
        System.out.println(MergeSortedArray(nums));
    }
    public static int MergeSortedArray(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]< nums[j]){
                int temp = nums[i+1];
                nums[i+1]=nums[j];
                nums[j]= temp;
                i++;
            }
            
        }
        return i+1;
    }
}
