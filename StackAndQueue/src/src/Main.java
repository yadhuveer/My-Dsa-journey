import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack obj1 = new Stack();
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        obj1.push(4);
        obj1.push(5);

       // System.out.println(obj1.pop());
        //System.out.println(obj1.pop());
        //System.out.println(obj1.pop());


        TwoStackGame obj2 = new TwoStackGame();
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println(obj2.twoStackGame(10, arr1, arr2, 0, 0));
    }
}