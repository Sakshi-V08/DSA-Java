package DP;

import java.util.Arrays;

public class ClimbingTaBulation {
     public static int countWays(int n){

        //tabulation loop 
      int dp[] = new int[n+1]; 
      dp[0] = 1;
      for(int i=1;i<=n;i++){
        if(i == 1){
            dp[i] = dp[i-1] + 0;
        }else{

            dp[i] = dp[i-1] + dp[n-2];
        }
       
      }
      return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n));
    }
}
