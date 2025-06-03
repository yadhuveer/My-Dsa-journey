package Permutations;
import  java.util.ArrayList;


public class Amazon {

    public static ArrayList<Integer> finalArray(ArrayList<Integer> arr1){

        if(arr1.size()==2){
            int newNum1= arr1.get(0)%10;
            int newNum2 = arr1.get(1)%10;
            arr1.clear();
            arr1.add(0,newNum1);
            arr1.add(1,newNum2);

            return arr1;
        }

        ArrayList<Integer> newArray = new ArrayList<>();

        for(int i=0;i<arr1.size()-1;i++){
            //newArray.add(arr1.get(i)+arr1.get(i+1));

            int num1 =  Character.getNumericValue(Integer.toString(arr1.get(i)).charAt(Integer.toString(arr1.get(i)).length()-1));
            int num2 =  Character.getNumericValue(Integer.toString(arr1.get(i+1)).charAt(Integer.toString(arr1.get(i+1)).length()-1));
            System.out.println(num1);
            System.out.println(num2);
            newArray.add(num1+num2);

        }

        return finalArray(newArray);

    }
}
