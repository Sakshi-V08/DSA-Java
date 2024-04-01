package Tries;

// is given prefix is lies in the array or not print boolean value "true 0r false"
public class StartsWithProblem {
    static class Node {
        Node[] childern = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                childern[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.childern[idx] == null) {
                curr.childern[idx] = new Node();
            }
            curr = curr.childern[idx];
        }
        curr.eow = true;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.childern[idx] == null) {
                return false;
            }
            curr = curr.childern[idx];
        }
        return true;
    }

    public static void main(String args[]) {
        String words[] = { "apple", "app", "mango", "man", "woman" };
        String prefix1 = "app";
        String prefix2 = "moon";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println("Prefix1 : " + startsWith(prefix2)); // it give false
        System.out.println("Prefix2 : " + startsWith(prefix1)); // it give true

    }
}
