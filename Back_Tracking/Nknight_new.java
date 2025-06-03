public class Nknight_new {

    public static int newKnight(boolean[][] board,int col){
        if(board.length==col){
            display(board);
            return 1;

        }

        int count=0;
        for(int row=0;row<board.length;row++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=newKnight(board,col+1);
                board[row][col]=false;
            }

        }

        return count;

    }
    public static boolean isSafe(boolean[][] board,int row,int col){

        if(row>0 && col>=2){
            row=row-1;
            col=col-2;
            if(board[row][col]==true){
                return false;
            }
            row=row+1;
            col=col+2;
        }


        if(row>0 && board.length-1-col>=2){
            row=row-1;
            col=col+2;
            if(board[row][col]==true){
                return false;
            }
            row=row+1;
            col=col-2;
        }

        if(row>=2 && col>0){

            row=row-2;
            col=col-1;
            if(board[row][col]==true){
                return false;
            }
            row=row+2;
            col=col+1;

        }

        if(row>=2 && board.length-1-col>=1){
            row=row-2;
            col=col+1;
            if(board[row][col]==true){
                return false;
            }
            row=row+2;
            col=col-1;

        }
        return true;
    }
    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
