package BinarySearch_Problems;

public class FindMinimumElement {


    public int BinaryMinimum(int[] arr){


        int start=0;
        int end = arr.length-1;
        int mid;

        while(start<=end){
            mid= start+(end-start)/2;

            if(arr[mid]<arr[mid-1]){
                return mid;
            }else if(arr[mid]>arr[mid+1]){
                return mid+1;
            }else if(arr[end]>arr[mid]){
                end=mid-1;

            }else{
                start=mid;
            }


        }
        return -1;


    }
}
