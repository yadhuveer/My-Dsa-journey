package BinarySearchRecursion;

public class BinarySearch {

    public int binary(int[] arr1, int target, int start, int end ){

        int mid;

        if(start>end){
            return -1;
        }

        mid= start+(end-start)/2;

        if(arr1[mid]==target){
            return mid;
        } else if (target>arr1[mid]) {
            return binary(arr1,target,mid+1,end);

        }else{
            return binary(arr1,target,start,mid-1);
        }
    }
}
