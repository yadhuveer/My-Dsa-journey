import java.util.Stack;

public class Parenthsis {

    Stack<Character> stack1 = new Stack<>();
    public boolean checkParenthsis (String str){
        for(char ch: str.toCharArray()){
            if(ch=='{' || ch=='(' || ch=='['){
                stack1.push(ch);
            } else if (ch=='}' && stack1.pop()!='{') {
                return false;
            } else if (ch==')' && stack1.pop()!=')') {
                return false;

            }else if(ch==']' && stack1.pop()!='['){
                return false;
            }
        }

        return stack1.isEmpty();

    }
}
