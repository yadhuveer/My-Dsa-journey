package Coding_NinjasProblem;

public class RemoveCompleteDuplicates {

    public String removeCompDuplicates(String str){

        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            String smallInput = removeCompDuplicates(str.substring(2));
            return smallInput;
        }else{
            String smallInput = removeCompDuplicates(str.substring(1));
            return str.charAt(0) + smallInput;
        }
    }
}
