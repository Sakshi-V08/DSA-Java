package Linked_List;

public class ZigZagLL {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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
    
    //Methods to find zig zag linked list
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        Node mid= slow;

        //reverse 2nd half 
        Node curr = mid.next;
        mid.next= null;
        Node prev= null;
        Node next;

        // 3 variable 4 steps
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr= next;
        }
        Node left = head;
        Node right= prev;
        Node nextL;
        Node nextR;

        //alt merge - zig-zag merge
        while(left != null && right != null)
        {
            nextL = left.next;
            left.next = right;
            nextR= right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }

    }
    public static void main(String args[])
    {
        ZigZagLL l1= new ZigZagLL();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        // 1 2 3 4 5
        System.out.println("Print before zigzag linked list: ");
        l1.print();
        l1.zigZag();
        System.out.println("Print after zigzag linked list: ");
        l1.print();
    }
    
}
