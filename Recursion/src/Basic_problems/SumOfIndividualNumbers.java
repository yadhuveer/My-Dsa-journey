package Basic_problems;

public class SumOfIndividualNumbers {

    public int sumIndividual(int num){
        if(num<=0){
            return 0;
        }
        else{
            return num % 10 + sumIndividual(num/10);
        }
    }
}
