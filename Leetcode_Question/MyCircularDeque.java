class MyCircularDeque {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularDeque(int k) {
        capacity = k;
        array = new int[k];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        array[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        array[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }

        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : array[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : array[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String args[]){
        MyCircularDeque q= new MyCircularDeque(5);
        q.insertFront(1);
        q.insertFront(2);
        q.insertFront(3);
        q.insertLast(4);
        q.insertLast(5);
        q.insertLast(6);
        q.insertLast(7);
        q.deleteFront();
        q.deleteLast();
        System.out.println("Get from first: "+q.getFront());
        System.out.println("Get from last:"+q.getRear());
        while(!q.isEmpty()){
            System.out.println(q.getFront());
            q.deleteFront();
        }
    }
} 
