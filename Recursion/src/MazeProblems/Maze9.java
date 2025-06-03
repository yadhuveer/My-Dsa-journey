package MazeProblems;

import java.util.Arrays;

public class Maze9 {

    public void mazeMethod(int d,int r,boolean[][] maze,String ref,int[][] arr,int val){

        maze[d][r]=false;

        if(d== maze.length-1 && r==maze[0].length-1){
            System.out.println(ref);

            for(int[] path:arr){
                System.out.println(Arrays.toString(path));
            }
            System.out.println();
            return;
        }
        if(!maze[d][r]){
            return;
        }
        maze[d][r]=false;
        arr[d][r]=val;
        if(d< maze.length-1){
            mazeMethod(d+1,r,maze,ref+"d",arr,val);
        }

        if(r<maze[0].length-1){
            mazeMethod(d,r+1,maze,ref+"r",arr,val);
        }

        if(d>0){
            mazeMethod(d-1,r,maze,ref+"u",arr,val);
        }

        if(r>0){
            mazeMethod(d,r-1,maze,ref+"l",arr,val);
        }

        maze[d][r]=true;
        arr[d][r]=0;
    }
}
