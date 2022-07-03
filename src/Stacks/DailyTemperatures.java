package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] question = new int[]{75,70,65,80,81,61};
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(question)));
    }
    public int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        int i =0; 
        int temp = 0;
        int curr = 0;
        while(i < temperatures.length){
            if(stack.isEmpty() || temperatures[i]< temperatures[stack.peek()]){
                stack.push(i);
                i++;
            }else{
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                    temp =stack.pop();
                    res[temp] = i-temp ;
                }
                stack.push(i);
                i++;
            }
        }
        return res;
    }
}
