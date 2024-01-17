package Hashing;
import java.util.*;
public class SetLoop {
    public static void main(String args[]){
        HashMap<String, Integer> hm =new HashMap<>();
        hm.put("India",100);
        hm.put("China",1000);
        hm.put("US",50);
        hm.put("Indonesia",40);
        hm.put("Nepal",599);

        //Iterate
        //entrySet() give pair set
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = "+k+", value = "+hm.get(k));
        }
    }
}
