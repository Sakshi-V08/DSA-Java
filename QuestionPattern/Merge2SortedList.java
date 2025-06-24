package QuestionPattern;

//you are given the heads of two sorted linked lists list1 and list2 Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two listd. Return the head of the merged linked list.
//used in linkedlist

public class Merge2SortedList {
    public static class Node {
    int value;
    Node next;

    Node(int val) {
        value = val;
        next = null;
    }
}
    static Node merge(Node l1, Node l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        Node ans = new Node(0);
        Node tail = ans;

        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null)
            tail.next = l1;
        if (l2 != null)
            tail.next = l2;

        return ans.next;
    }

    static Node newNode(int val) {
        return new Node(val);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    public static void main(String[] agrs) {
        Node head1 = newNode(1);
        head1.next = newNode(2);
        head1.next.next = newNode(4);

        Node head2 = newNode(1);
        head2.next = newNode(3);
        head2.next.next = newNode(4);

        Node mergedHead = merge(head1, head2);

        printList(mergedHead);
    }
}
