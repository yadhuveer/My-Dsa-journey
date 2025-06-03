package DP;

import java.util.ArrayList;

public class Fibonacci2 {
ArrayList<Integer> dpList = new ArrayList<>();
public Fibonacci2(){
    this.dpList.add(0,0);
    this.dpList.add(1,1);
}


public  int dpMethod(int num){
    for(int i=2;i<=num;i++) {
        this.dpList.set(i, this.dpList.get(i - 1) + this.dpList.get(i - 2));
    }
    return this.dpList.get(num);



}
}
