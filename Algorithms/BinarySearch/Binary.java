package BinarySearch;

public class Binary {
    public int search(int[] arr,int target){

        int start=0;
        int end = arr.length-1;
        int mid;

        while(start<=end){

            mid = start +(end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
