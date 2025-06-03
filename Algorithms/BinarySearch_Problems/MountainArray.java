package BinarySearch_Problems;

public class MountainArray {

    public int mountain(int[] arr){

        int start=0;
        int end= arr.length-1;
        int mid;

        while(start<=end){
            mid= start+(end-start)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid]>=arr[mid-1]) {
                start=mid;
            }
            else{
                end=mid;
            }
        }
        return -1;
    }
}
