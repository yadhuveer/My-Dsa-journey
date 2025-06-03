package problems;

public class findErrorNumbers {

    public int[] findErrorNums(int[] nums) {
        int i=0;
        int temp;
        int correctIndex;

        int[] arrayRes = new int[2];

        while(i<nums.length){

            correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                arrayRes[0]=nums[j];
                arrayRes[1]=j+1;
            }
        }
        return arrayRes;





    }

}
