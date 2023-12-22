
public class MergeSortLL {
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

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Split the linked list into two halves
        ListNode middle = findMiddle(head);
        ListNode secondHalf = middle.next;
        middle.next = null;

        // Recursively sort the two halves
        ListNode sortedFirstHalf = sortList(head);
        ListNode sortedSecondHalf = sortList(secondHalf);

        // Merge the sorted halves
        return merge(sortedFirstHalf, sortedSecondHalf);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If one of the lists is not fully processed
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // You can create a linked list and test the sortList method here if needed.
        MergeSortLL l1 = new MergeSortLL();
        
        l1.addFirst(3);
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(4);
        l1.print();
        l1.sortList(head);
        l1.print();
    }
}
