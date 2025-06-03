package DP;

public class MaxPathSum_Recursion {

    public static int getMaxPathSum(int[][] matrix) {
        // Write your code here
        int maxSum=Integer.MIN_VALUE;
        int currentMaxSum;
        for(int i=0;i<matrix[0].length;i++){
            currentMaxSum= helper(matrix,0,0,i);
            if(currentMaxSum>maxSum){
                maxSum=currentMaxSum;
            }
        }


        return maxSum;

    }

    public static int helper(int[][] matrix,int sum,int row,int col){
        if(row==matrix.length){
            return sum;
        }

        int diagonalLeftSum=Integer.MIN_VALUE;
        int diagonalRightSum=Integer.MIN_VALUE;

        int downSum = helper(matrix,sum+matrix[row][col],row+1,col);
        if(col>0){
            diagonalLeftSum= helper(matrix,sum+matrix[row][col],row+1,col-1);
        }

        if(col<matrix[0].length-1){
            diagonalRightSum=helper(matrix,sum+matrix[row][col],row+1,col+1);

        }

        int newMax= Math.max(downSum,diagonalLeftSum);
        return Math.max(newMax,diagonalRightSum);


    }
}
