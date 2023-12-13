package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    // 2 Pointer Approach
    public static boolean PairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            // case1 
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            // case 3
            else {
                rp--;
            }

        }
        return false;
    }

    public static void main(String agrs[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 50;
        System.out.println(PairSum1(list, target));
    }

}
