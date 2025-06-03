package MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        MergeSort obj1 = new MergeSort();

        int[] arr1={5,4,3,2,1};
        obj1.mergeSort(arr1);
        System.out.println(Arrays.toString(arr1));
        //int[] arr3={5,4,3,2,1};
        //MergeSortKunal1 obj3 = new MergeSortKunal1();


        //System.out.println(Arrays.toString(obj3.mergeSort(arr1)));
    }
}
