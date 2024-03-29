package GreedyAlgorithms;

import java.util.*;

public class FractionalKnapsack {
    public static void main(String args[]) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 70;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx ; 1st col=> ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // ascending order  4,5,6
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        // descending order -  Arrays.sort(twoDim, Comparator.comparingInt(a -> a[0]).reversed());


        int capacity = w;
        int finalVal=0;
        //descending order
        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];  //ratio = 6,5,4
            if (capacity >= weight[idx]) {
                finalVal+=val[idx];
                capacity-=weight[idx];
            }else{
                //include fractional item
                finalVal+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Final Value :"+finalVal);
    }

}
