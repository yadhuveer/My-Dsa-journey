package Basic_problems;

public class printNto1 {

    public  void printDes(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            printDes(n-1);
        }
    }
}
