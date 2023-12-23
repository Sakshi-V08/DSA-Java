package Linked_List;

public class DoubleLL {
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

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

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

    // remove - removeFirst
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // removeLast
    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    public static void main(String args[]) {
        DoubleLL dl1 = new DoubleLL();
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

        System.out.println("Print after adding from last element:");
        dl1.addLast(8);
        dl1.print();
        System.out.println("size: " + dl1.size);

        System.out.println("Print after remove from first element:");
        dl1.removeFirst();
        dl1.print();
        System.out.println("size: " + dl1.size);

        System.out.println("Print after remove from last element:");
        dl1.removeLast();
        dl1.print();
        System.out.println("size: " + dl1.size);
    }

}
