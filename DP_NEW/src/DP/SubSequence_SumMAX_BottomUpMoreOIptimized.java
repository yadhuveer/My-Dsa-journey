package DP;

public class SubSequence_SumMAX_BottomUpMoreOIptimized {

    public static int subMax(int[] arr1, int n){

        int[] dp = new int[n];

        dp[0]=arr1[0];
        dp[1]=Math.max(arr1[0],arr1[1]);

        for(int i=2;i<n;i++){
            dp[i]=Math.max((dp[i-2]+arr1[i]),dp[i-1]);
        }
        return dp[n-1];
    }

}
