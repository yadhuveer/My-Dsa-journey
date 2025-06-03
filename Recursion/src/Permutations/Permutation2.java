package Permutations;

import java.util.ArrayList;

public class Permutation2 {

    public static ArrayList<String> permutations(String str,String ref){

        if(str.isEmpty()){

            //System.out.println(ref);
            ArrayList<String> newlist = new ArrayList<>();
            newlist.add(ref);

            return newlist;
        }


        char letter = str.charAt(0);
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<=ref.length();i++){
            String first = ref.substring(0,i);
            String last = ref.substring(i,ref.length());
            result.addAll(permutations(str.substring(1),first+letter+last));

        }

        return result;

    }
}
