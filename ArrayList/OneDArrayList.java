package ArrayList;

import java.util.*;

public class OneDArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
         list.add(2);
          list.add(3);
           list.add(4);
            list.add(5);

            // //Get Operation - O(1)
            // int element = list.get(2);
            // System.out.println(element);

            // //Delete
            // list.remove(2);
            // System.out.println(list);

            //Set Operation
            // list.set(2,10);
            // System.out.println(list);
            
            //Contains Opertaion
            // System.out.println(list.contains(1));
            // System.out.println(list.contains(11));

            //print the arraylist
            // for(int i=0;i<list.size();i++){
            //     System.out.println(list.get(i));
            // }
            // System.out.println();

            //Reverse print
            for(int i=list.size()-1;i>=0;i--){
                System.out.println(list.get(i)+" ");
            }
            System.out.println();
    }

}
