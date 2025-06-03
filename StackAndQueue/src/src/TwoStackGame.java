import java.util.ArrayList;

public class TwoStackGame {

    public static int twoStackGame(int maxSum, ArrayList<Integer> list1, ArrayList<Integer> list2, int sum, int count ){
       if(maxSum==sum){
           return count;
       }
       if(sum>maxSum){

           return count-1;
       }
       int ans1=0;
       int ans2=0;
       if(!list1.isEmpty()){
           int num1=list1.remove(0);
            ans1 = twoStackGame(maxSum,list1,list2,sum+num1,count+1);
           list1.add(0,num1);

       }
       if(!list2.isEmpty()){
           int num2 = list2.remove(0);
            ans2 = twoStackGame(maxSum,list1,list2,sum+num2,count+1);
           list2.add(0,num2);


       }


       return Math.max(ans1,ans2);

    }


}

