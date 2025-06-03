package OOP;

import java.util.Arrays;

public class passBYValueAndReference {

    public static void main(String[] args){

        String a = "Yadhu";
        String b = a;
        b="Madhu";

        System.out.println(b);
        System.out.println(a);

        String[] nameArray = {"y","a","d","h","u"};

        String[] nameArray2 = nameArray;

        nameArray2[0]="A";

        System.out.println(Arrays.toString(nameArray));
    }
}
