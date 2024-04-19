package Linked_List;

public class LinkedList2 {
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

    // Methods to add first on index first O(n)
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2-> newNode next = head
        newNode.next = head; // linking step

        // step 3-> head = newNode
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
    
    // Methods for detection the loop or cycle in linked list
    public static boolean isCycle(){    //Floyd's Cycle 
        Node slow = head; 
        Node fast =head;

        while(fast != null && fast.next != null){
            slow= slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; //cycle exists
            }
        }
        return false; //cycle doesn't exist
    }

    //Method to remove the loop/ cycle in linked list
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;  //last node
        while (slow != fast){
            prev= fast;
            slow= slow.next; //+1
            fast= fast.next; //+1
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }
    public static void main(String args[]) {
        head = new Node(1);
        Node temp= new Node(2);
        head.next= temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1-> 2 -> 3 -> 2
        System.out.println("Is Cycle is Exists : " +isCycle());
        removeCycle();
         System.out.println("Is Cycle is Exists: "+isCycle());
    }
    
}
