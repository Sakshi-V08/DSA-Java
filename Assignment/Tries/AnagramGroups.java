package Tries;

import java.util.*;

public class AnagramGroups {
    class TrieNode {
        Map<Character, TrieNode> children;
        List<String> words;

        public TrieNode() {
            children = new HashMap<>();
            words = new ArrayList<>();
        }
    }

    TrieNode root = new TrieNode();

    private String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public void insert(String word) {
        String sortedWord = sortString(word); // eat -> aet , tea -> aet , tan-> ant , ate-> aet , nat-> ant , bat-> abt
        TrieNode node = root;
        // looping
        for (char c : sortedWord.toCharArray()) { // e,a,t -> a,e,t t,e,a -> a,e,t t,a,n-> a,n,t a,t,e->a,e,t n,a,t->
                                                  // a,n,t b,a,t -> a,b,t
            node.children.putIfAbsent(c, new TrieNode()); // key-> c , value-> trieNode
            node = node.children.get(c); // get value trieNode
        }
        node.words.add(word);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        for (String str : strs) {
            insert(str);
        }

        List<List<String>> result = new ArrayList<>();
        gatherAnagrams(root, result);
        return result;
    }

    private void gatherAnagrams(TrieNode node, List<List<String>> result) {
        if (node == null)
            return;

        if (!node.words.isEmpty()) {
            result.add(new ArrayList<>(node.words));
        }

        for (TrieNode child : node.children.values()) {
            gatherAnagrams(child, result);
        }
    }

    public static void main(String[] args) {
        AnagramGroups solution = new AnagramGroups();

        // Example usage
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }
}
