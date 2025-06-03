package DP;

public class FrogJump_Dp {

    public static int frogJump(int steps, int currentstep, int[] ennArr, int[] dp){

        if(currentstep==steps-1){


            return 0;
        }

        if(dp[currentstep]!=-1){
            return dp[currentstep];
        }
        int energy2;
        int energy1 = Math.abs(ennArr[currentstep+1]-ennArr[currentstep])+frogJump(steps,currentstep+1,ennArr,dp);

        if(currentstep<steps-2){
             energy2 = Math.abs(ennArr[currentstep+2]-ennArr[currentstep])+frogJump(steps,currentstep+2,ennArr,dp);
        }else{
            energy2=Integer.MAX_VALUE;
        }

        dp[currentstep]=Math.min(energy1,energy2);

        return Math.min(energy1,energy2);


    }

}