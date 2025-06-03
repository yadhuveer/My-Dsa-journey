package BinarySearch_Problems;

public class FirstAndLastOccurance {

    public int[] occurances(int[] nums, int target) {

        int start = 0;
        //int end= arr.length-1;
        int mid1;
        int mid2;


        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int firstPos = binary(nums, target, false);
        int lastPos = binary(nums, target, true);
        return new int[]{firstPos, lastPos};


    }

        public int  binary(int[] arr,int target, boolean endIndex){
            int ans=-1;

            int start=0;
            int end = arr.length-1;
            int mid;

            while(start<=end){

                mid=start+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    ans=mid;
                    if(endIndex){
                        start=mid+1;


                    }else{
                        end=mid-1;

                    }
                }
            }

            return ans;



        }

   }


