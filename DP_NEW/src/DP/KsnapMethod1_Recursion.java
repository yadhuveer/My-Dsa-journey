package DP;

public class KsnapMethod1_Recursion {

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Change in the given tree itself.
         * No need to return or print the output.
         * Taking input and printing output is handled automatically.
         */

        return helper(weight,value,n,maxWeight,0,0,0);

    }

    public static int helper(int[] weight,int[] value,int n,int maxWeight,int index,int sum,int currentWeight){
        if(index==n){
            if(currentWeight>maxWeight){
                return 0;
            }
            return sum;
        }

        int sum1=0;
        if(currentWeight>maxWeight){
            sum1=0;
        }else{
            sum1=helper(weight,value,n,maxWeight,index+1,sum+value[index],currentWeight+weight[index]);
        }

        int sum2= helper(weight,value,n,maxWeight,index+1,sum,currentWeight);

        return Math.max(sum1,sum2);
    }
}
