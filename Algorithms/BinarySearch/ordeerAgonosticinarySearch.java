package BinarySearch;

public class ordeerAgonosticinarySearch {
    public int search(int[] arr,int target){

        boolean isAsync;

        int start=0;
        int end = arr.length-1;

        if(arr[start]<=arr[end]){
            isAsync=true;
        }else{
            isAsync=false;
        }
        int mid;

        while(start<=end){

            mid = start +(end-start)/2;

            if (isAsync){

                if(target>arr[mid]){
                    start = mid+1;
                } else if (target<arr[mid]) {
                    end = mid-1;
                }
                else{
                    return mid;
                }

            }else{

                if(target>arr[mid]){
                    end = mid-1;
                } else if (target<arr[mid]) {
                    start = mid+1;
                }
                else{
                    return mid;
                }

            }
        }
        return -1;
    }
}
