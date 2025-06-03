package BinarySearch_Problems;

public class Rotated_BinarySearch_repeatedIndex {

    public int mountain(int[] arr){

        int start=0;
        int end= arr.length-1;
        int mid;

        while(start<=end){
            mid= start+(end-start)/2;

            if((mid-1)<0){
                return 0;
            }

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid]>arr[mid-1] && !(arr[0]>arr[mid])) {
                start=mid;
            }
            else{
                end=mid;
            }
        }
        return -1;
    }
}
