package ArrayProblems;

import java.util.ArrayList;

public class MultipleLinearSearch {

    public ArrayList search(int[] arr, int target){

        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        return helper(arr,target,index,list);
    }

    public ArrayList helper(int[] arr, int target, int index, ArrayList resArray){

        if( index == arr.length){
            return resArray;
        }

        if(arr[index]== target){
            resArray.add(index);
        }

        return helper(arr,target,index+1,resArray);
    }

}
