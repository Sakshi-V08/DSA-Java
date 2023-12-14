package Linked_List;

import java.lang.Character.Subset;

public class LinkedList {
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
    public static int size;

    // Methods to add first on index first O(n)
    public void addFirst(int data) {
        // step 1 =create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2-> newNode next = head
        newNode.next = head; // linking step

        // step 3-> head=newNode
        head = newNode; // point to newNode head

    }

    // Method add from last O(n)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
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

    // Methods to add in the middle
    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i =idx-1; temp ->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to remove element from the list
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Method to remove the element from last
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty.");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // previous : i =size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // Method for searching the element in list
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key is found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key is not found
        return -1;
    }

    // Method for searching the element by recursion
    public int helper(Node head, int key) { // O(n)
        if (head == null) {
            return -1; // it return index of the found element
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Method for reversing the list O(n) ( 3 variable 4 steps very important point
    // please memorized it)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Method to find and remove nth node from end
    public void deletNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // removeFirst
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head; // previous
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
    
    //Method to find Palindrome of list
    // Slow-fast approach
    public Node findMid(Node head){  //helper
        Node slow = head;
        Node fast= head;

        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast= fast.next.next; //+2
        }
        return slow;  //slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2- reverse 2nd half
        Node prev = null;
        Node curr= midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }

        Node right=prev;//right half head 
        Node left= head;

        //step3- check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left= left.next;
            right= right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(5);
        l1.addFirst(2);
        l1.addFirst(1); // 2->1
        l1.addLast(3);
        l1.addLast(4);
        l1.addMiddle(2, 9);
        l1.print();
        System.out.println("Print Size of List: " + l1.size);
        l1.removeFirst();
        l1.print();

        l1.removeLast();
        l1.print();
        System.out.println("Print Size of List: " + l1.size);

        System.out.println("Print found element's index by iteration: " + l1.itrSearch(5));
        System.out.println("Print found element's index by recursion: " + l1.recSearch(5));

        System.out.println("Print reverse of the list: ");
        l1.reverse();
        l1.print();
        l1.deletNthfromEnd(3);
        l1.print();

        System.out.println(l1.checkPalindrome());
        
    }

}
