package Permutations;

import java.util.ArrayList;

public class Dice_List {
    public static ArrayList<String> RollDice(String ref, int target){

        if( target==0){
            System.out.println(ref);
            ArrayList<String> curr = new ArrayList<>();
            curr.add(ref);

            return curr;
        }
        if(target<0){
            return new ArrayList<>();
        }
       ArrayList<String> res    = new ArrayList<>();
        for(int i=1;i<=6;i++){
            res.addAll(RollDice(ref+i,target-i));
        }
        return res;

    }
}
