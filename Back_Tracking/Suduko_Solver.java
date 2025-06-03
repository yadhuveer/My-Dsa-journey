public class Suduko_Solver {

    public static boolean Suduko(int[][] board){

        int row=-1;
        int col=-1;


        boolean isCompleted=true;

        for(int i=0;i<board.length;i++){
            for(int j=0; j<board.length;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;

                    isCompleted=false;
                }
            }
        }

        if (isCompleted){
            return true;
        }

        for(int number=1;number<=9;number++){
            if(IsSafe(board,row,col,number)){
                board[row][col]=number;
                if(Suduko(board)){
                    return true;
                }else{

                    board[row][col]=0;
                }
            }
        }
        return false;

    }



    private static boolean IsSafe(int[][] board,int row,int col,int num){

        for(int k=0;k<board.length;k++){
            if(board[row][k]==num){
                return false;
            }
        }

        for(int[] arr: board){
            if(arr[col]==num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int start = row-row % sqrt;
        int end = col - col % sqrt;



        for(int r=start;  r<start+sqrt;r++){
            for(int c= end;c<end+sqrt;c++){
                if(board[r][c]==num){
                    return false;
                }
            }
        }



        return true;

    }

}
