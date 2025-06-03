package Coding_NinjasProblem;

public class RemoveDuplicates {

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here


        if(s.length()<=1){
            return s;
        }


        if(s.charAt(0)==s.charAt(1)){
            String smallInput = removeConsecutiveDuplicates(s.substring(1));
            return smallInput;
        }else{
            String smallInput = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0) + smallInput;
        }

    }


}
