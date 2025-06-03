package Basic_problems;

public class CountZeros {

    public int zero(int num){
        int count =0;
         return helper(num,count);
    }

    public int helper(int num,int count){
        if(num==0){
            return count;
        }

        if(num%10==0){
            ++count;
        }
        return helper(num/10,count);
    }


}
