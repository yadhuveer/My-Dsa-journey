package LinkedList;

public class HappyNumber {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            slow = sumSquare(slow);
            fast = sumSquare(sumSquare(fast));
            if(fast==1){
                return true;
            }
        }while(fast!=slow);

        if(fast==1){
            return true;
        }

        return false;

    }
    public int sumSquare(int num){
        int reqNum =0;

        while(num>0){
            int rem = num % 10;
            reqNum+= rem*rem;
            num= num/10;
        }
        return reqNum;
    }
}
