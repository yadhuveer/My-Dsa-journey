package ArrayProblems;

public class SortedArray {

    public boolean checkSort(int[] arr){
        int index = 0;

        return helper(arr,index);
    }

    public boolean helper(int[] arr,int index){

        if(index==arr.length-1){
            return true;
        }

        if(!(arr[index]<arr[index+1])){
            return false;
        }

        index++;

        return helper(arr,index);
    }
}
