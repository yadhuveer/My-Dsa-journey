package com.yadhu;
import java.util.Arrays;
import java.util.Scanner;


public class ReversingArray {
    public static void main(String[] args){
        int[] arrayNo;
        String StringInput;

        Scanner scanner = new Scanner(System.in);

        StringInput = scanner.nextLine();

        arrayNo = Arrays.stream(StringInput.split(" ")).mapToInt(Integer::parseInt).toArray();

        int start=0;
        int end= arrayNo.length-1;

        while(start < end){

            reverseArray(arrayNo, start, end);

            start++;

            end--;
        }



        System.out.println(Arrays.toString(arrayNo));

    }

    static void reverseArray(int[] arrayNo, int index1, int index2){

        int temp;
        temp = arrayNo[index1];
        arrayNo[index1]= arrayNo[index2];
        arrayNo[index2]=temp;


    }
}
