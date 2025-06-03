package Coding_NinjasProblem;

public class ReverseString {

    public static String ReverseStr(String str){

        if(str.length()==0){

            return str;
        }


        String smallInput = ReverseStr(str.substring(0,str.length()-1));

        return  str.charAt(str.length()-1) + smallInput;
    }
}
