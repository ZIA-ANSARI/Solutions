package Stacks;

import java.util.Stack;

class MinStack {
    Stack<Integer> min;
    Stack<Integer> og;
    
    public MinStack() {
         og = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if(min.isEmpty() || min.peek() >= val)
            min.push(val);
        og.push(val);

    }
    
    public void pop() {
        int temp = og.pop();
        if(temp == min.peek())
            min.pop();
    }
    
    public int top() {
        return og.peek();
    }
    
    public int getMin() {
        return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
