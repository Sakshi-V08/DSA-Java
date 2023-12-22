package Linked_List;

import java.util.LinkedList;   //JCF -> Optimize
public class LinkedListJCF {
    public static void main(String args[]){
        //create 
        LinkedList<Integer> l1 = new LinkedList<>();
       
        //add
        l1.addLast(1);
        l1.addLast(2);
        l1.addFirst(0);
        //0 -> 1 -> 2
        System.out.println(l1);

        //remove
        l1.removeLast();
        l1.removeFirst();
        System.out.println(l1);

    }
    
}
