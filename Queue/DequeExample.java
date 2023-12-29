package Queue;
import java.util.*;
public class DequeExample {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        
        // Now you can use the deque variable to perform deque operations
        deque.addFirst(1);
         deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
         System.out.println("Deque elements: " + deque);

        // Print the elements in the deque
        //System.out.println("Deque elements: " + deque);
        deque.removeFirst();
        System.out.println("Deque elements: " + deque);
        System.out.println("First el= "+deque.getFirst());
        System.out.println("First el= "+deque.getLast());
    }
}
