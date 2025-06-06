package DP;

import java.util.* ;
import java.io.*;
import java.util.Arrays;
public class Ksnap_TopDown {

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Change in the given tree itself.
         * No need to return or print the output.
         * Taking input and printing output is handled automatically.
         */

        int[][] dp = new int[n][maxWeight+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return helper(weight,value,n,maxWeight,0,0,dp);

    }
    public static int helper(int[] weight,int[] value,int n,int maxWeight,int index,int currentWeight,int[][] dp){

        if(index==n){
            return 0;
        }

        if(dp[index][currentWeight]!=-1){
            return dp[index][currentWeight];
        }

        currentWeight=currentWeight+weight[index];

        int sum1;
        if(currentWeight>maxWeight){
            sum1=0;
        }else{
            sum1=value[index]+helper(weight,value,n,maxWeight,index+1,currentWeight,dp);
        }
        currentWeight= currentWeight-weight[index];
        int sum2=helper(weight,value,n,maxWeight,index+1,currentWeight,dp);

        dp[index][currentWeight]=Math.max(sum1,sum2);

        return Math.max(sum1,sum2);
    }

}
