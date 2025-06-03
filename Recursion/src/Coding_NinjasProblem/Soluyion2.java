package Coding_NinjasProblem;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ref = new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> subsetList = createSubset(nums,0,ref);
        //System.out.println(subsetList.get(0));
        return subsetList;
    }

    public static List<List<Integer>> createSubset(int[] arr1,int index,List<Integer>ref){

        if(index==arr1.length){
            List<List<Integer>> refList = new ArrayList<>();
            refList.add(new ArrayList<>(ref));
            return refList;
        }



        ref.add(arr1[index]);


        List<List<Integer>> left = createSubset(arr1,index+1,ref);
        ref.remove(ref.size()-1);

        while(index+1<arr1.length && arr1[index]==arr1[index+1]){
            index++;
        }

        List<List<Integer>> right = createSubset(arr1,index+1,ref);

        List<List<Integer>> newList = new ArrayList<>();
        newList=left;
        newList.addAll(right);

        return newList;

    }
}