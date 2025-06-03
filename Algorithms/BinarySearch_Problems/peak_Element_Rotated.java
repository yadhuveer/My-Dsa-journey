package BinarySearch_Problems;

public class peak_Element_Rotated {

    public int findLargestInRotatedArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(mid-1<0){
                return 0;
            }

            if (mid<end && arr[mid] > arr[mid+1]) {
                return mid;
            } else if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;

            } else if (arr[start]==arr[mid] && arr[mid]==arr[end]) {
                
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
                
            } else if (arr[start]<=arr[mid] ) {

                start=mid+1;
                
            }else{
                end = mid-1;
            }


        }

        // At the end of the loop, start == end
        return -1;
    }

}
