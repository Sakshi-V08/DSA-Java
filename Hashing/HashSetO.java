package Hashing;

import java.util.*;

public class HashSetO {
    public static void main(String args[]) {
        // It store unique value
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        set.remove(2);
        if (set.contains(2)) {
            System.out.println("Set contains 2");
        }
        System.out.println(set);
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
