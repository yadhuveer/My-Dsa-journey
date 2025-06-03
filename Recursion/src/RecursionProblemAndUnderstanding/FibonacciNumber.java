package RecursionProblemAndUnderstanding;

public class FibonacciNumber {

    public  int fib(int num){
        if(num == 1 || num == 0){
            return num;
        }

        int num2 = fib(num-1) +fib(num-2);
        System.out.println(num2);
        System.out.println("hi");
        return num2;
    }
}
