import java.util.Stack;

import javax.lang.model.util.ElementScanner6;

public class validParantheses {


    public boolean isValid(String s) {
        
       char[] ch = s.toCharArray();

       Stack<Character> stack = new Stack<>();

       for(char c : ch){
           if(stack.isEmpty())
                stack.push(c);
            else if(c == '{'|| c == '(' || c == '[' ) {
                stack.push(c);
            }
            else if((c == '}' && stack.peek() == '{') ||
                    (c == ')' && stack.peek() == '(') ||
                    (c == ']' && stack.peek() == '[')){
                        stack.pop();
                    }
            else{
                return false;
            }

       }if(stack.isEmpty())
            return true;
        return false;   
    }
    
}
