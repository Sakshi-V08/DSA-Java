package Queue;

import java.util.*;

public class InterLeave {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) { // keep in mind never use here q.size because if we use q.size it change
                                             // its value in each iteration so before you store the size
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(q.remove());
            q.add(firstHalf.remove());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);

        interLeave(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
