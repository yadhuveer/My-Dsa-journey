package MazeProblems;

public class Maze1 {

    public int mazeMethod(int r,int c){

        if(r==1 || c==1){

            return 1;
        }

        int down = mazeMethod(r-1,c);
        int right = mazeMethod(r,c-1);

        return down+ right;
    }
}
