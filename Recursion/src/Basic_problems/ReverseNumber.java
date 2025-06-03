package Basic_problems;

public class ReverseNumber {

    public int revNumber(int num){

        int noOfDigits = (int)(Math.log10(num)) + 1;
        return helper(num, noOfDigits);
    }

    public int helper(int n, int digits){

        if(n%10 == n){
            return n;
        }
        else{
            return (n%10)*(int)Math.pow(10,digits-1) + helper(n/10 , digits-1);
        }
    }
}
