package DP;

import java.util.ArrayList;

public class UniquePathDp_BottomUp {

    public static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat){

        int[][] dp = new int[n][m];
        if(mat.get(0).get(0)==-1){
            dp[0][0]=0;
        }else{
            dp[0][0]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    continue;
                }

                if(mat.get(i).get(j)!=-1){
                    if(i==0){
                        dp[i][j]=dp[i][j-1];
                    } else if (j==0) {
                        dp[i][j]=dp[i-1][j];
                    }else{
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return dp[n-1][m-1];
    }

}
