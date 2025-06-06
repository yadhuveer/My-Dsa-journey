package DP;

import java.util.ArrayList;
import java.util.Arrays;
public class UniquePathDP_TopDown {
    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        int[][] dp = new int[mat.size()][mat.get(0).size()];
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.get(0).size(); j++) {
                dp[i][j] = -1;
            }

        }
        return helper(mat, 0, 0, dp);
    }
    public static int helper(ArrayList<ArrayList<Integer>> mat, int row, int col,int[][] dp){

        if(row==mat.size()-1 && col== mat.get(0).size()-1){

            return 1;
        }

        if(dp[row][col]!=-1){
            return dp[row][col];
        }

        if(mat.get(row).get(col)==-1){
            return 0;
        }

        int left;
        int right;


        if(row<mat.size()-1){
            left=helper(mat,row+1,col,dp);
        }else{
            left=0;
        }


        if(col<mat.get(0).size()-1){
            right=helper(mat,row,col+1,dp);
        }else{
            right=0;
        }

        dp[row][col]=(left+right)%1000000007;
        return (left+right)%1000000007;


    }

}
