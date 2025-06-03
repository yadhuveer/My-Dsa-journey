package MazeProblems;

public class Maze7 {

    public void mazeMethod(int d,int r,boolean[][] maze,String ref){




        if(d== maze.length-1 && r==maze[0].length-1){
            System.out.println(ref);

            return;
        }


        if(!maze[d][r]){
            return;
        }

        maze[d][r]=false;

        if(d< maze.length-1){
            mazeMethod(d+1,r,maze,ref+"d");
        }

        if(r<maze[0].length-1){
            mazeMethod(d,r+1,maze,ref+"r");
        }

        if(d>0){
            mazeMethod(d-1,r,maze,ref+"u");
        }

        if(r>0){
            mazeMethod(d,r-1,maze,ref+"l");
        }

        maze[d][r]=true;
    }
}
