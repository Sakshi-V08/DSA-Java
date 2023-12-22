package Linked_List;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data= data;
            this.next= null;
            this.prev= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head== null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev=newNode;
        head = newNode;
    }

    //print
    public void print(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    //remove - removeLast
    

    public static void main(String args[]){
        DoubleLL dl1 = new DoubleLL();
        dl1.addFirst(3);
        dl1.addFirst(2);
        dl1.addFirst(1);

        dl1.print();
        System.out.println(dl1.size);
    }


    
}
