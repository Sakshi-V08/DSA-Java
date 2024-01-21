package Hashing;
import java.util.*;
public class HashSetIteration {

    //Unordered set
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Varanasi");
        cities.add("Benguluru");
        cities.add("Noida");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for(String city : cities){
        //     System.out.println(city);
        // }
        System.out.println(cities);
     
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Varanasi");
        lhs.add("Benguluru");
        lhs.add("Noida");
        
        // for(String city : lhm){
        //     System.out.println(city);
        // }
        System.out.println(lhs);
 
        //sorted manner
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Delhi");
        ts.add("Varanasi");
        ts.add("Benguluru");
        ts.add("Noida");

        System.out.println(ts);
    }
}
