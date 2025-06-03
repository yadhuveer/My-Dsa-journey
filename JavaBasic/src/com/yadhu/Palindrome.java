package com.yadhu;

public class Palindrome {
    public static void main(String[] args){
        String name= " ";

        boolean boolPalin = palindrome(name);
        System.out.println(boolPalin);
    }

    static boolean palindrome( String name){

        if (name==null || name.length()==0){
            return true;
        }

        int start=0;
        int end= name.length()-1;

        while(start<end){

            if(name.charAt(start)!=name.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;


    }
}
