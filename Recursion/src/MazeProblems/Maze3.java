package MazeProblems;

import java.util.ArrayList;

public class Maze3 {

    public static ArrayList<String> mazeMethod(int d, int r, String ref ){
        if(d==1 & r==1){
            //System.out.println(ref);
            ArrayList<String> newList = new ArrayList<>();
            newList.add(ref);
            return newList;
        }
        ArrayList<String> down= new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if(d>1){
            down= mazeMethod(d-1,r,ref+"d");
        }

        if(r>1){
             right = mazeMethod(d,r-1,ref+"r");
        }

        down.addAll(right);
        return down;
    }
}
