package Linked_List;
import java.util.LinkedList;

public class LinkedList3 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step 1 =create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2-> newNode next = head
        newNode.next = head; // linking step

        // step 3-> head=newNode
        head = newNode; // point to newNode head

    }

    // Methods to print list O(n)
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;  //mergeLL = -1 which is delete that is mergedLL.next
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String args[]) {
        LinkedList3 l1 = new LinkedList3();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);

        // 5 4 3 2 1
        l1.print();
        l1.head = l1.mergeSort(l1.head);
        l1.print();
    }
    
}
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

//         if(list1!=null && list2!=null){
//         if(list1.val<list2.val){
//             list1.next=mergeTwoLists(list1.next,list2);
//             return list1;
//             }
//             else{
//                 list2.next=mergeTwoLists(list1,list2.next);
//                 return list2;
//         }
//         }
//         if(list1==null)
//             return list2;
//         return list1;
//     }
// }