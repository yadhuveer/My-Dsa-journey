package DP;

public class HouseRobber2With_BottomUp {

    public static int HouseRiober2(int[] inputArr1,int n){

        int[] dp1= new int[n];

        int[] dp2 = new int[n];

        dp1[0]= inputArr1[0];
        dp1[1]=  Math.max(inputArr1[0],inputArr1[1]);

        dp2[1]= inputArr1[1];
        dp2[2]=  Math.max(inputArr1[1],inputArr1[2]);

        for(int i=2;i<n-1;i++){
            dp1[i]=Math.max((dp1[i-2]+inputArr1[i]),dp1[i-1]);

        }
       int max1=dp1[n-2];

        for(int i=3;i<n;i++){
            dp2[i]=Math.max((dp2[i-2]+inputArr1[i]),dp2[i-1]);

        }

        int max2=dp2[n-1];

        return Math.max(max1,max2);
    }

}
