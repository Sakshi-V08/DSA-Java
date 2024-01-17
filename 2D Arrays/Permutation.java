import java.util.ArrayList;
import java.util.List;

public class Permutation{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permuteHelper(nums, used, current, result);
        return result;
    }

    private void permuteHelper(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                current.add(nums[i]);
                used[i] = true;

                permuteHelper(nums, used, current, result);

                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Permutation Permutation= new Permutation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = Permutation.permute(nums);

        System.out.println("Permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
