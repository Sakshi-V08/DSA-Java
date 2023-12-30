package Stack;

import java.util.*;

public class Parenthese {

    public static boolean isValid(String str) {  //O(n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') { // opening
                s.push(ch);
            } else { // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            System.out.println("It is valid parenthese.");
            return true;
        } else {
            System.out.println("It is invalid parenthese.");
            return false;
        }
    }

    public static void main(String args[]) 
    {
        String str = "(({}))[]"; // true
        System.out.println(isValid(str));
    }
}


// import java.util.Stack;

// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack<Integer> stack = new Stack<>();
//         int maxLength = 0;
//         stack.push(-1); // Initialize the stack with -1 to handle edge cases

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (ch == '(') {
//                 stack.push(i); // Push the index of '(' onto the stack
//             } else {
//                 // Closing parenthesis
//                 stack.pop(); // Pop the top element as '(' is matched

//                 if (stack.isEmpty()) {
//                     // If stack is empty, push the current index onto the stack to represent the starting point
//                     stack.push(i);
//                 } else {
//                     // Calculate the length of the current valid parentheses substring
//                     maxLength = Math.max(maxLength, i - stack.peek());
//                 }
//             }
//         }

//         return maxLength;
//     }
// }
