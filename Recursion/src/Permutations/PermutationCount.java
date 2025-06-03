package Permutations;

public class PermutationCount {

    public static int countPermutation(String str,String ref){

        if(str.isEmpty()){
            return 1;
        }
        int count =0;

        char ch = str.charAt(0);
        for(int i=0;i<=ref.length();i++){

            String f = ref.substring(0,i);
            String l = ref.substring(i,ref.length());

            count=count+countPermutation(str.substring(1),f+ch+l);
        }
        return count;
    }

}
