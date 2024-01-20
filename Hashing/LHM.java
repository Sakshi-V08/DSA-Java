package Hashing;

// LinkedHashMap 
import java.util.*;

public class LHM {
    public static void main(String args[]) {
        //key insert in sequence as insert in LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Us", 80);
         //key insert as random manner in HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 80);
        //key insert as sorted manner in treeMap 
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Us", 80);
 
        System.out.println(lhm);
        System.out.println(hm);
        System.out.println(tm);
    }
}
