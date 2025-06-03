import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int[] arr1, ArrayList<Integer> newArr){


        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!(hashMap.containsKey(arr1[i]))){
                newArr.add(arr1[i]);
                hashMap.put(arr1[i],true);
            }
        }

        return newArr;

    }

}
