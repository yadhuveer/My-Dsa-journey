import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stackList = new ArrayList<>();

    public  boolean push(int num){
        this.stackList.add(num);
        return true;
    }

    public int pop(){
        if(this.IsEmpty()){
            return -1;
        }
        return this.stackList.remove(this.stackList.size()-1);
    }

    public boolean IsEmpty(){
        return this.stackList.isEmpty();
    }


}
