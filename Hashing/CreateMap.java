package Hashing;

import java.util.*;

public class CreateMap {

    public static void main(String args[]) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 1000);
        hm.put("US", 140);
        hm.put("America", 108);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        //ContainsKey - O(1) it return true or false depending upon key is exist or not
        System.out.println(hm.containsKey("India")); //true

        //Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //Size
        System.out.println("Size: "+hm.size());
        
        //Clear
        hm.clear();
        
        //Is empty
        System.out.println(hm.isEmpty());

        
    }

}
