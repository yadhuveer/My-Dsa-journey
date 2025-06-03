package Permutations;

public class Dice {

    public static void RollDice(String ref,int target){

        if( target==0){
            System.out.println(ref);
        }
        if(target<0){
            return;
        }

        for(int i=1;i<=6;i++){
            RollDice(ref+i,target-i);
        }

    }
}
