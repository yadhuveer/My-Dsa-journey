package Coding_NinjasProblem;

import java.util.ArrayList;

public class GenserateSubset3 {

    public static ArrayList<String> subset(String str, String ref,ArrayList<String> list1){

        if(str.length()==0){
            System.out.println(ref);
            list1.add(ref);
            return list1;
        }

        char letter = str.charAt(0);

        //subset(str.substring(1),ref+letter);
        //subset(str.substring(1),ref);

        subset(str.substring(1),ref,list1);
        return subset(str.substring(1),ref+letter,list1);



    }
}
