package DP;

public class SubSequence_SumMAX_BottomUp {

    public static int subsequenceSUMMax(int[] arr1, int n){

        int fullSum=0;


        for(int i=0;i<n;i++){
            fullSum+=arr1[i];
        }

        int[][] dp = new int[n][fullSum];

        for(int i=0; i<n;i++){
            for(int j=0;j<fullSum;j++){
                dp[i][j]=0;
            }
        }
        int maximun=Integer.MIN_VALUE;

        dp[0][arr1[0]]=arr1[0];
        dp[1][arr1[1]]= arr1[1];
        dp[1][arr1[0]]=arr1[0];

        for(int i= 2;i<n;i++){
            for(int j=0;j<fullSum;j++){
                if(j<arr1[i]){
                    dp[i][j]=dp[i-1][j];
                    if(dp[i][j]>maximun){
                        maximun=dp[i][j];
                    }
                }else if(j==arr1[i]){
                    dp[i][j]=arr1[i];
                    if(dp[i][j]>maximun){
                        maximun=dp[i][j];
                    }
                }else{
                    int comp= j-arr1[i];
                    if(dp[i-2][comp]!=0){
                        dp[i][j]=j;
                        if(dp[i][j]>maximun){
                            maximun=dp[i][j];
                        }
                    }else {
                     dp[i][j]=dp[i-1][j];
                        if(dp[i][j]>maximun){
                            maximun=dp[i][j];
                        }
                    }
                }
            }
        }
        return maximun;
    }
}
