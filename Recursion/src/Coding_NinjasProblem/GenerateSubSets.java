package Coding_NinjasProblem;

public class GenerateSubSets {

    public static void fun(String str,String curr, int index){
        if(index==str.length()){
            System.out.println(curr);
            return;
        }
        fun(str,curr,index+1);
        fun(str,curr+str.charAt(index),index+1);
    }
}
