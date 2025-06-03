package DP;

public class TriangleMinPath_BottomUp {

    public static int minimumPathSum(int[][] triangle, int n){

        int[][] dp = new int[n][n];

        dp[0][0]=triangle[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(i==0){
                    continue;
                }
                if(j==0){
                    dp[i][j]=dp[i-1][j]+triangle[i][j];
                }else{

                    dp[i][j]=Math.min((dp[i-1][j]+triangle[i][j]),dp[i-1][j-1]+triangle[i][j]);
                }
            }
        }
        int minPath = dp[n - 1][0];
        for (int j = 1; j < n; j++) {
            minPath = Math.min(minPath, dp[n - 1][j]);
        }

        return minPath;

    }

}
