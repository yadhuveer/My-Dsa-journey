package Coding_NinjasProblem;

public class Replace {

    public static String replacePi(String str){

        if(str.length()<=0){

            return str;
        }

        String smallInput = replacePi(str.substring(2));

        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            return "3.14" + smallInput;

        }else{
            return ""+ str.charAt(0) + str.charAt(1) + smallInput;
        }


    }
}
