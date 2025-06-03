package BinarySearchRecursion;

public class Main {
    public static void main(String[] args ){
        BinarySearch bin1 = new BinarySearch();

        int [] arr1= {10,20,30,40,50,60,70};
        int target = 50;
        int num1=bin1.binary(arr1,target,0, arr1.length-1);
        System.out.println(num1);

    }
}
