package Tries;
import java.util.*;
public class LongestwordwithallPrefix {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;

        public Node(){
            for(int i=0 ;i<26;i++){
                children[i] =null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        int level =0;
        int len = word.length();
        int idx=0;

        Node curr = root;
        for(; level<len;level++){
            idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr= curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String key){
        int level =0;
        int len = key.length();
        int idx=0;

        Node curr= root;
        for(; level<len;level++){
            idx =key.charAt(level)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow == true;
    }
    public static String ans ="";
    public static void longestWord(Node root, StringBuilder temp){
        //BC
        if(root == null){
            return;
        }
        //for(int i=25;i>=0;i--)   for find larger value

        for(int i=0;i<26;i++){ //lexicography  a generalization of the alphabetical order of the dictionaries to sequences of ordered symbols 
            if(root.children[i] != null && root.children[i].eow == true)
            {
                char ch =(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()){

                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); //backtrack  string me se delete hoga
            }
        }
    }
    public static void main(String[] args) {
        String word[] ={"a","banana","app","appl","ap","apply","apple"};

        for(int i=0;i<word.length;i++){
  
            insert(word[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
    
}
//if you want get greater string then only change the loop simply.