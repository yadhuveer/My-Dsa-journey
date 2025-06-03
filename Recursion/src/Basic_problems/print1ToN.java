package Basic_problems;

public class print1ToN {

    public  void printAsc(int n){
        if(n==0){
            return;
        }
        else{
            printAsc(n-1);
            System.out.println(n);
        }
    }
}
