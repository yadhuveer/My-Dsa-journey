package Permutations;

public class Permutation {

    public static void permutations(String str,String ref){

        if(str.isEmpty()){

            System.out.println(ref);
            return;
        }


        char letter = str.charAt(0);

        for(int i=0;i<=ref.length();i++){
            String first = ref.substring(0,i);
            String last = ref.substring(i,ref.length());
            permutations(str.substring(1),first+letter+last);
        }

    }
}
