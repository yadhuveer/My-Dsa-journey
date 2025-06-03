package Coding_NinjasProblem;

public class RepaceString {

    public static String replaceStr(String str,char toChar,char replaceChar){

        if(str.length()==0){
            return str;
        }



        String smallOutput = replaceStr(str.substring(1),toChar,replaceChar);
        if(str.charAt(0)==toChar){
            return replaceChar+smallOutput;
        }else{
            return str.charAt(0)+smallOutput;

        }



    }
}
