package Basic_problems;

public class SumOfNnumbers {

    public int sum1(int num){
        if(num==1){
            return 1;
        }
        else{
            return num +sum1(num-1);
        }
    }
}
