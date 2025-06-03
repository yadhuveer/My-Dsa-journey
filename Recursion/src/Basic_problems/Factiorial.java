package Basic_problems;

public class Factiorial {

    public int fact(int num){
        if(num<=1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
}
