package DP;

import java.util.ArrayList;

public class Fibonacci {

    ArrayList<Integer> numlist=new ArrayList<>();

    public Fibonacci(){
        this.numlist.add(0,0);
        this.numlist.add(1,1);
    }
    public  int fibonacci(int num){

        if(num<=1){
            return num;
        }

        while(numlist.size()<=num){
            numlist.add(-1);
        }

        if(numlist.get(num)!=-1){
            return numlist.get(num);

        }

        int temp= fibonacci(num-1)+fibonacci(num-2);
        this.numlist.set(num,temp);
        return temp;


    }
}
