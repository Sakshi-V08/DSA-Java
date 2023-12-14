
import java.lang.Character.Subset;

public class ReverseLinkedList2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode head;
    public static ListNode tail;

    public void addFirst(int data) {
        // step 1 =create new node
        ListNode newNode = new ListNode(data);

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
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to reverse linked list
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move to the node before the reversal starts
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Reverse the sublist from left to right
        ListNode current = prev.next;
        ListNode next;

        for (int i = left; i < right; i++) {
            next = current.next;
            current.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }

    public static void main(String args[]) {
        ReverseLinkedList2 l1 = new ReverseLinkedList2();
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        l1.reverseBetween(head,2,4);
        l1.print();
    }
}
