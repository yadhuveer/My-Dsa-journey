package Basic_problems;

public class PalindromeNumber {

    public boolean palin(int num){

        int s= 0;
        int e = String.valueOf(num).length()-1;
        return helper(num,s,e);
    }

    public boolean helper(int n,int s,int e){

        if(!(String.valueOf(n).charAt(s)==String.valueOf(n).charAt(e))){
            return false;
        }

        if(s>=e){
            return true;
        }

        s= ++s;
        e=--e;
        return helper(n,s,e);
    }
}
