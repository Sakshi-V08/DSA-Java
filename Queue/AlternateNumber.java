package Queue;

import java.util.*;

public class AlternateNumber {
    public static void alternateNo(Deque<Integer> d1) {
        Deque<Integer> d2 = new LinkedList<>();
        while (!d1.isEmpty()) {
            if (!d1.isEmpty()) {
                d2.addLast(d1.removeLast());
            }
            if (!d1.isEmpty()) {
                d2.addLast(d1.removeFirst());
            }
        }
        System.out.println("After alternating the numbers:");
        while (!d2.isEmpty()) {
            System.out.print(d2.remove() + " ");
        }
    }

    public static void main(String args[]) {
        Deque<Integer> d1 = new LinkedList<>();

        // Now you can use the d1 variable to perform d1 operations
        d1.addLast(1);
        d1.addLast(2);
        d1.addLast(3);
        d1.addLast(4);
        d1.addLast(5);
        System.out.println("d1 elements: " + d1);
        alternateNo(d1);
    }
}
