package BinarySearch_Problems;

public class PeakElementInUnsortedArray {

    public int findPeakElement(int[] nums) {
        int start=0;
        int end= nums.length-1;

        int mid;
        if(nums.length>1){
            if(nums[nums.length-1]>nums[nums.length-2]){
                return nums.length-1;
            }
        }
        while(start<=end){
            mid= start+(end-start)/2;

            if(mid-1<0 || mid+1>nums.length-1){
                if(nums[0]>nums[nums.length-1]){
                    return 0;

                }else{
                    return nums.length-1;
                }
            }
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<=nums[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }

        if(nums[0]>nums[nums.length-1]){
            return 0;
        }else{
            return nums.length-1;
        }
    }

}
