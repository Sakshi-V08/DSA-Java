package GreedyAlgorithms;
import java.util.*;
public class ActivitySelection {
    public static void main(String args[]){   //O(n)
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        //sorting  O(nlogn)
        int activites[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activites[i][0]=i;
            activites[i][1]=start[i];
            activites[i][2]=end[i];
        }

        //lambda function -> shortform
        Arrays.sort(activites, Comparator.comparingDouble(o->o[2]));
        //end time basis non sorted array

         int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();  //it store the activity index
       
        //1st activity
        maxAct=1;
        ans.add(activites[0][0]);
        int lastEnd=activites[0][2];
        for(int i=1;i<end.length;i++){
            if(activites[i][1]>= lastEnd){
                //activity select
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd=activites[i][2];
            }
        }
        System.out.println("max activites= "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

        //end time basis sorted
    //     int maxAct=0;
    //     ArrayList<Integer> ans=new ArrayList<>();  //it store the activity index
       
    //     //1st activity
    //     maxAct=1;
    //     ans.add(0);
    //     int lastEnd=end[0];
    //     for(int i=1;i<end.length;i++){
    //         if(start[i]>= lastEnd){
    //             //activity select
    //             maxAct++;
    //             ans.add(i);
    //             lastEnd=end[i];
    //         }
    //     }
    //     System.out.println("max activites= "+maxAct);
    //     for(int i=0;i<ans.size();i++){
    //         System.out.println("A"+ans.get(i)+" ");
    //     }
    //     System.out.println();
    }
}
