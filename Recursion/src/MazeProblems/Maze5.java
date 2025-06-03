package MazeProblems;

import java.util.ArrayList;

public class Maze5 {

    public static ArrayList<String> mazeMethod(int d, int r, String ref ){
        if(d==1 & r==1){
            ArrayList<String> newList = new ArrayList<>();
            newList.add(ref);
            return newList;
            //System.out.println(ref);
        }
        ArrayList<String> allPath = new ArrayList<>();
        if(d>1){
            allPath.addAll(mazeMethod(d-1,r,ref+"d"));
        }

        if(r>1){
            allPath.addAll(mazeMethod(d,r-1,ref+"r"));
        }

        if(d>1 && r>1){
            allPath.addAll(mazeMethod(d-1,r-1,ref+"c"));
        }
        return allPath;

    }
}
