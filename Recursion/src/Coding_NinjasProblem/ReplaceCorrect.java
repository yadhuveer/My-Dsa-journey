package Coding_NinjasProblem;

public class ReplaceCorrect {

    public String replace(String str){

        if(str.length()<=1){
            return str;
        }



        if(str.charAt(0)=='p' && str.charAt(1)=='i'){

            String smallInput = replace(str.substring(2));
            return "3.14"+smallInput;
        }else{
            String smallInput = replace(str.substring(1));
            return str.charAt(0) + smallInput;
        }


    }
}
