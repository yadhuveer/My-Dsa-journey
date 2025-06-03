package DP;

import java.util.ArrayList;

public class SubsequenceMax_Dp {

    public static int subSeqSum(ArrayList<Integer> arr, int index,  boolean firstCall,int[][] dp){

        if(index==arr.size()){
            return 0;
        }

        int arrIndex;
        if(firstCall){
             arrIndex=0;
        }else{
             arrIndex=1;
        }

        if(dp[arrIndex][index]!=-1){
            return dp[arrIndex][index];
        }
        int firstSum=0;
        if(firstCall){

        }else{

            firstSum = arr.get(index)+subSeqSum(arr,index+1,true,dp);
        }

        int secondSum = subSeqSum(arr,index+1,false,dp);

        dp[arrIndex][index]=Math.max(firstSum,secondSum);
        return Math.max(firstSum,secondSum);

    }
}
