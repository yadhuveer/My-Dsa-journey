package DP;

public class Steps {
    public static long countDistinctWayToClimbStair(int nStairs) {
        // Write your code here.
        int count=0;
        return helper(nStairs);
    }

    public static long  helper(int nStairs){

        if(nStairs==0){
            return 1;
        }
        if(nStairs<0){
            return 0;
        }

        long count =0;

        for(int i=1;i<=2;i++){
            count+=helper(nStairs-i);
        }
        return count;

    }
}
