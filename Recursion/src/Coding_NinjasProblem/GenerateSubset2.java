package Coding_NinjasProblem;

public class GenerateSubset2 {

    public static void subset(String str, String ref){

        if(str.length()==0){
            System.out.println(ref);
            return ;
        }

        char letter = str.charAt(0);

        //subset(str.substring(1),ref+letter);
        //subset(str.substring(1),ref);

        subset(str.substring(1),ref);
        subset(str.substring(1),ref+letter);



    }
}
