package Stack;

import java.util.*;

public class Question3 {
    // Push at the Bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    // Reverse a stack

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;

        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Reverse the stack:");
        //3,2,1
        reverseStack(s);
        //1,2,3
        printStack(s);
    }

}
