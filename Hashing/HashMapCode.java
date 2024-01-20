package Hashing;

import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> { // generic (any type) <K,V> k and v type we dont know which type it this
        private class Node { // in every bucket has node type this
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

        }

        private int n; // n
        private int N;
        private LinkedList<Node> buckets[]; // N= buckets.length create linkedlist type arr

        @SuppressWarnings("unchecked") // we cant write direct LL type it give warning
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode(); // 12345 , -13234 //) to n()-1
            return Math.abs(hc) % N; // it give remainder number in between 0 to n()-1
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0; // Initial

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i); // in ll it give node
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets; // store bucket data
            buckets = new LinkedList[N * 2]; // complety empty
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>(); // create empty ll at particular bucket new one
            }

            // node -> add in bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }

            }
        }

        public void put(K key, V value) { // O(lambda) -> O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi); // valid when it is exist, if not exist it give -1

            if (di != -1) { // if data exist in ll
                Node node = buckets[bi].get(di); // udpate
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value)); // if not exist it create node in ll
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containKey(K key) { // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) { // valid
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) { // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) { // O(1)
            int bi = hashFunction(key); // give backet idx
            int di = SearchInLL(key, bi); // give data idx

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i]; // store linkedlist of particular bucket
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);
         
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
             System.out.println(key);
        }

        System.out.println(hm.get("China")); //print value
    }
}
