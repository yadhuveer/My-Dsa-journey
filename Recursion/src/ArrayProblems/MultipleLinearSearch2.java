package ArrayProblems;

import java.util.ArrayList;

public class MultipleLinearSearch2 {

    public ArrayList search(int[] arr, int target){

        int index = 0;
        //ArrayList<Integer> list = new ArrayList<>();
        return helper(arr,target,index);
    }

    public ArrayList helper(int[] arr, int target, int index){


        ArrayList<Integer> list = new ArrayList<>();

        if( index == arr.length){
            return list;
        }

        if(arr[index]== target){
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowCalls = helper(arr,target,index+1);

        list.addAll(answerFromBelowCalls);

        return list;
    }

}
