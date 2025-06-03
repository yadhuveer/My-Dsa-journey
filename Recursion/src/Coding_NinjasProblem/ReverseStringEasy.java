package Coding_NinjasProblem;

public class ReverseStringEasy {

    public static String ReverseStr(String str){

        if(str.length()==0){

            return str;
        }


        String smallInput = ReverseStr(str.substring(1));

        return   smallInput +str.charAt(0);
    }
}
