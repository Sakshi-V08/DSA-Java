package Hashing;
import java.util.*;
public class MajorityElement {
    public static void main(String args[]){
        int arr[] ={1,2};
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            //shortcut
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);  //if key is not exist it return 0 else add one
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i],map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i],1);
            // }
        }
        
        //Set<Integer> keySet = map.keySet();
        for (Integer key : map.keySet()) {
            if(map.get(key) > arr.length /3){
                System.out.println("The element :"+ key);
            }
        }
    }
}
