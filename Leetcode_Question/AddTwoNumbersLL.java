public class AddTwoNumbersLL {

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

    private ListNode head;
    private ListNode tail;

    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String args[]) {
        AddTwoNumbersLL l1 = new AddTwoNumbersLL();
        AddTwoNumbersLL l2 = new AddTwoNumbersLL();
        AddTwoNumbersLL l3 = new AddTwoNumbersLL();
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(2);
        l2.addFirst(4);
        l2.addFirst(6);
        l2.addFirst(5);
        System.out.print("List 1: ");
        l1.print();
        System.out.print("List 2: ");
        l2.print();

        l3.head = l3.addTwoNumbers(l1.head, l2.head);

        System.out.print("Sum: ");
        l3.print();
    }
}

