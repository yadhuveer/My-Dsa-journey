package problems;

import java.util.ArrayList;
import java.util.List;

public class MultipleMissingNumber {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i=0;
        int correctIndex;
        int temp;
        ArrayList<Integer> numArray = new ArrayList<Integer>();


        while(i<nums.length){

            correctIndex = nums[i]-1;
            if(nums[correctIndex]!=nums[i]){

                temp = nums[i];
                nums[i]= nums[correctIndex];
                nums[correctIndex]=temp;

            }else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                numArray.add(j+1);
            }
        }
        return numArray;

    }
}
