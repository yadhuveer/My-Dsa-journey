public class Nknight {

    public static int Knight(boolean[][] board,int row){

        if(row==board.length){
            display(board);
            return 1;

        }

        int count=0;
        for(int col=0; col<board.length;col++){

            if(isSafe(board,col,row)){
                board[row][col]=true;
                count+=Knight(board,row+1);
                board[row][col]=false;
            }

        }
        return count;


    }


    private static boolean isSafe(boolean[][] board,int col,int row){

        if(col>=2 && row>0){

           col=col-2;
           row=row-1;
           if(board[row][col]==true){
               return false;
           }
           col=col+2;
           row=row+1;
        }

        if(board.length-1-col>=2 && row>0){
            col=col+2;
            row=row-1;
            if(board[row][col]==true){
                return false;
            }
            col=col-2;
            row=row+1;

        }

        if(row>=2 && col>0){
            row=row-2;
            col=col-1;
            if(board[row][col]==true){
                return false;
            }
            col=col+1;
            row=row+2;
        }

        if(row>=2 && col<board.length-1){
            row=row-2;
            col=col+1;
            if(board[row][col]==true){
                return false;
            }
            col=col-1;
            row=row+2;
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



