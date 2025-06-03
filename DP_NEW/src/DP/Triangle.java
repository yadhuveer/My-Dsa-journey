package DP;

public class Triangle {
    public static int minimumPathSum(int[][] triangle, int n) {
        return helper(triangle,0,0,0);
    }


    public static int helper(int[][] triangle,int sum, int row, int col){



        if(triangle.length==row){
            return sum;
        }

        int downSum=helper(triangle,sum+triangle[row][col],row+1,col);

        int diagonalSum = helper(triangle,sum+triangle[row][col],row+1,col+1);

        return Math.min(downSum,diagonalSum);

    }
}
