package Stacks;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParantheses {

    public static void main(String[] args) {
        GenerateParantheses generateParantheses = new GenerateParantheses();
        System.out.println(
        generateParantheses.generateParenthesis(3).toString());
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder stack = new StringBuilder();

        backTracking(0, 0, n, result, stack);
        return result;
        
    }

    private void backTracking(int openN, int closeN, int n, List<String> result, StringBuilder stack){

        if(openN == closeN && closeN == n){
            result.add(
            stack.toString());
        }
        if(openN < n){
            stack.append('(');
            backTracking(openN+1, closeN, n, result, stack);
            stack.setLength(stack.length()-1);
        }

        if(closeN < openN){
            stack.append(')');
            backTracking(openN, closeN+1, n, result, stack);
            stack.setLength(stack.length()-1);
        }

    }
    
}
