package MazeProblems;

public class Maze2 {
    public static void mazeMethod(int d, int r, String ref ){
        if(d==1 & r==1){
            System.out.println(ref);
            return;
        }

        if(d>1){
            mazeMethod(d-1,r,ref+"d");
        }

        if(r>1){
            mazeMethod(d,r-1,ref+"r");
        }
    }
}
