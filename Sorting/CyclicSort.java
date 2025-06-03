public class CyclicSort {

    public static int[] Cyclic(int[] arr1){

        int i=0;

        while(i<arr1.length-1){

            int correct = arr1[i]-1;
            if(arr1[i]!=arr1[correct]){
                int temp = arr1[i];
                arr1[i]=arr1[correct];
                arr1[correct]=temp;
            }else{
                i++;
            }
        }
        return arr1;
    }
}
