package MergeSort;

import java.util.Arrays;

public class MergeSortKunal1 {

    public int[] mergeSort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return sortedArray(left,right);
    }


    public int[] sortedArray(int[] left,int[] right){

        int[] mergeArray = new int[left.length +right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< left.length && j<right.length){

            if(left[i]<right[j]){
                mergeArray[k]=left[i];
                i++;
                k++;
            }else{
                mergeArray[k]=right[j];
                j++;
                k++;
            }
        }

        while (i< left.length){

            mergeArray[k]=left[i];
            i++;
            k++;

        }


        while (j< right.length){

            mergeArray[k]=right[j];
            j++;
            k++;

        }
        return mergeArray;


    }

}
