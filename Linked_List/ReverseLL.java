package Linked_List;

public class ReverseLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String args[]) {
        ReverseLL dl1 = new ReverseLL();
        System.out.println("Print after adding from first element:");
        dl1.addFirst(7);
        dl1.addFirst(6);
        dl1.addFirst(5);
        dl1.addFirst(4);
        dl1.addFirst(3);
        dl1.addFirst(2);
        dl1.addFirst(1);

        dl1.print();
        System.out.println("size: " + dl1.size);

        dl1.reverse();
        dl1.print();

    }
}
