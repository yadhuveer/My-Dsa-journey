package problems;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int i=0;
        int correctIndex;
        int temp;

        while(i<nums.length){
            correctIndex= nums[i];
            if(correctIndex>0){
                temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }else{
                i++;
            }

        }

        System.out.println("Hi");

        for(int j=1;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return -1;

    }
}
