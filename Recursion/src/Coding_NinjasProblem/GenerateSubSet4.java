package Coding_NinjasProblem;
import java.util.ArrayList;

public class GenerateSubSet4 {

    public  static ArrayList<String> subset(String str, String ref){
        if(str.isEmpty()){
            ArrayList<String> list1 = new ArrayList<String>();
            list1.add(ref);
            return list1;
        }

        char letter = str.charAt(0);

        ArrayList<String> left = subset(str.substring(1),ref+letter);
        ArrayList<String> right = subset(str.substring(1),ref);

        left.addAll(right);
        return  left;


    }
}
