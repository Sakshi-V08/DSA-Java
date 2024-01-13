package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    static class Student implements Comparable<Student> { // Overridding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // pq.add(3); // O(logn)
        // pq.add(4);
        // pq.add(2);
        // pq.add(1);
        // pq.add(7);

        // 
        
        //Student class 
        PriorityQueue<Student> s = new PriorityQueue<>();

        s.add(new Student("A",4));
        s.add(new Student("B",5));
        s.add(new Student("C",2));
        s.add(new Student("D",12));
        s.add(new Student("E",16));

        while(!s.isEmpty()){
            System.out.println(s.peek().name+"-> "+s.peek().rank);  //O(1)
            s.remove();  //O(logn)
        }
    }
}
