package problems;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int i =0;
        int temp;
        int correctIndex;

        while(i<nums.length){

            if(nums[i]!=i+1){
                correctIndex=nums[i]-1;

                if(nums[i]!=nums[correctIndex]){
                    temp = nums[i];
                    nums[i]=nums[correctIndex];
                    nums[correctIndex]=temp;


                }else{
                    return nums[i];
                }

            }else{
                i++;
            }
        }

        return -1;
    }

}
