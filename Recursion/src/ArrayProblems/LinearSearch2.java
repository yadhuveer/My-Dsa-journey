package ArrayProblems;

public class LinearSearch2 {

    public boolean search(int[] arr, int target){

        int index = 0;

        return helper(arr,target,index);
    }

    public boolean helper(int[] arr, int target,int index){

        if( index == arr.length){
            return false;
        }

        return arr[index]==target || helper(arr,target,++index);
    }
}
