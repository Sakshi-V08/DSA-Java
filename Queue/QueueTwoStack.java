package Queue;
import java.util.*;
public class QueueTwoStack {
    static class Queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add - O(n)
        public static void add(int data){
            while(!s1.isEmpty()){   //O(n)
                s2.push(s1.pop());
            }
            s1.push(data);                    //+= O(2n)=> O(n)

            while(!s2.isEmpty()){  //O(n)
                s1.push(s2.pop());
            }
        }

        //remove  O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
