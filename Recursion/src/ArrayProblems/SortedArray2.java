package ArrayProblems;

public class SortedArray2 {

    public boolean checkSort(int[] arr){
        int index = 0;

        return helper(arr,index);
    }

    public boolean helper(int[] arr,int index){

        if(index==arr.length-1){
            return true;
        }


        return arr[index]<arr[index+1] && helper(arr,++index);
    }
}
