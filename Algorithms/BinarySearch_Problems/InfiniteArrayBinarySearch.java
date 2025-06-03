package BinarySearch_Problems;

public class InfiniteArrayBinarySearch {

    public int search(int[] arr,int target) {


        int start = 0;
        int end = 1;
        int mid;
        while(target>arr[end]){
            int temp=end;
            end= end+(end-start+1)*2;
            start = temp+1;
        }

        while(start<=end){
            mid = start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
