package Stack;

import java.util.*;

public class NextGreater {
    public static void main(String args[]) { // O(n)
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) { // arr[s.peek()] means s.peek top me idx hoga us idx se
                                                              // arr ke element ko dekhege
                s.pop();
            }
            // 2 if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // 3 push in stack
            s.push(i);
        }
        System.out.println("Next Greater: ");
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }

}
// next greater right reverse loop start
// next greater left = loop change
// next smaller right = conditional operator >=
// next smaller left = conditional operator >= with loop change