package MazeProblems;

public class Maze6 {
    public  static void pathRestrictions(String ref, boolean[][] maze,int d, int r){

        if(d==maze.length-1 && r==maze[0].length-1){
            System.out.println(ref);
        }

        if(!maze[d][r]){
            return;
        }

        if(d< maze.length-1){
            pathRestrictions(ref+"d",maze,d+1,r);
        }

        if(r<maze[0].length-1){
            pathRestrictions(ref+"r",maze,d,r+1);
        }
    }
}
