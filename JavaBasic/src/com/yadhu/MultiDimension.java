package com.yadhu;

import java.util.Arrays;

public class MultiDimension {

    public static void main(String[] args){

        String name = "Yadhuv";

        Arrays.toString(name.toCharArray());

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toCharArray());

        char [] nameArray = name.toCharArray();

        int start= 0;

        int end = nameArray.length-1;

        while(start<end){

            char temp = nameArray[start];
            nameArray[start] = nameArray[end];
            nameArray[end]  = temp;

            start++;
            end--;
        }

        System.out.println(nameArray);

        String name2 = String.valueOf(nameArray);

        System.out.println(name2);

        if(name.charAt(0) == name.charAt(0)){
            System.out.println("hi");
        }


    }

}
