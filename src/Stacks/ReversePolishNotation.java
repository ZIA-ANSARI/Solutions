package Stacks;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        String[] question = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println( reversePolishNotation.evalRPN(question));
       

        
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> expressions = new Stack<>();
        int result = 0;
        for(String str : tokens){
            if(str.equals("/")  ){
                int temp1 = expressions.pop();
                int temp2 = expressions.pop();
                result = temp2/temp1;
                expressions.push(result);
            }
            else if(str.equals( "*") ){
                int temp1 = expressions.pop();
                int temp2 = expressions.pop();
                result = temp2*temp1;
                expressions.push(result);
            }else if(str.equals("+")  ){
                int temp1 = expressions.pop();
                int temp2 = expressions.pop();
                result = temp2+temp1;
                expressions.push(result);
            }else if(str.equals( "-") ){
                int temp1 = expressions.pop();
                int temp2 = expressions.pop();
                result = temp2-temp1;
                expressions.push(result);
            }else
                expressions.push(Integer.valueOf(str));

        }
        return expressions.peek();
    }
}
