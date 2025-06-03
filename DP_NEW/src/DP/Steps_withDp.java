package DP;

import java.util.Arrays;

public class Steps_withDp {

    public static int steps(int step){

        int[] arr1 = new int[step+1];

        Arrays.fill(arr1,-1);
        return helper(step,arr1);
    }

    public static int helper(int step,int[] arr1){

        if(step==0){
            return 1;
        }


        if(step<0){
            return 0;
        }

        if(arr1[step]!=-1){
            return arr1[step];
        }

        int count =0;

        for(int i=1;i<=2;i++){
            count+=helper(step-i,arr1);
        }

        arr1[step]=count;
        return count;
    }



}
