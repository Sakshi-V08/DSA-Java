package Hashing;
import java.util.*;
public class FindTicket {
    //Find Itinerary from tickets
    public static String getStart(HashMap<String, String> tickets){ // idhr start ka parameter aa rha 
        HashMap<String, String> revMap = new HashMap<>(); //revmap me start to bn jayega and to start bn jayega parameter

        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }

        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; //starting point
            }
        }
        return null;

    }
    public static void main(String args[]){  //O(n)
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start= tickets.get(start);
        }

        System.out.println();
    }
    
}
