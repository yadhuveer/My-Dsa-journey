package DP;

import java.util.ArrayList;

public class SubsequenceMax {


    public static int subSeqSum(ArrayList<Integer> arr, int index, int sum, boolean firstCall){

        if(index==arr.size()){
            return sum;
        }
        int firstSum;
        if(firstCall){
            firstSum=0;
        }else{
            firstSum = subSeqSum(arr,index+1,sum+arr.get(index),true);
        }

        int secondSum = subSeqSum(arr,index+1,sum,false);

        return Math.max(firstSum,secondSum);

    }
}
