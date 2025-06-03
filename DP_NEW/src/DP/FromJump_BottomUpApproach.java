package DP;

public class FromJump_BottomUpApproach {

    public  static int frogJump(int[] energy, int n){

        int[] dp = new int[n];

        dp[0]=0;
        dp[1]=Math.abs(energy[1]-energy[0]);

        for(int i=2;i<n;i++){
            dp[i]=Math.min((dp[i-2]+Math.abs(energy[i]-energy[i-2])),(dp[i-1]+Math.abs(energy[i]-energy[i-1])));
        }
        return dp[n-1];

    }

}
