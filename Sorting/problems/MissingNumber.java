package problems;

public class MissingNumber {
    public int Missing(int[] arr){
        int i=0;
        int temp;
        int correctIndex;

        while(i<arr.length){
            correctIndex =arr[i];

            if(arr[correctIndex]!=arr[i] && correctIndex<arr.length){
                temp = arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;

            }else{
                i++;
            }

        }

        for(int j=0;j<arr.length;j++){
            if(j!=arr[j]){
                return j;
            }
        }
        return arr.length;

    }
}
