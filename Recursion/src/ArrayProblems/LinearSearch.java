package ArrayProblems;

public class LinearSearch {

    public int search(int[] arr, int target){

        int index = 0;

        return helper(arr,target,index);
    }

    public int helper(int[] arr, int target,int index){

        if( index == arr.length){
            return -1;
        }

        if(arr[index]== target){
            return index;
        }

        return helper(arr,target,++index);
    }
}
