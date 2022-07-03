package Stacks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class CarFleet {

    public static void main(String[] args) {
        CarFleet carFleet = new CarFleet();
        int[] question = new int[]{0,4,2};
        int[] question2 = new int[]{2,1,3};
        System.out.println(
        carFleet.carFleet(10, question, question2));
    }

    public int carFleet(int target, int[] position, int[] speed) {

        int res = 0;
        int[][] merged = new int[position.length][2];
        for(int i = 0 ; i< position.length ; i++){
            merged[i][0] = position[i];
            merged[i][1] = speed[i];
        }
        Sort2DArrayBasedOnColumnNumber(merged, 1);
        System.out.println(
        Arrays.deepToString(merged));
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < merged.length; i++){
            if(stack.isEmpty() ){
                stack.push((double) ((double)(target - merged[i][0]))/(double)merged[i][1] );
            }else if(((double)((double)(target - merged[i][0]))/(double)merged[i][1] <= stack.peek())){
                // stack.pop();
                // stack.push((double) ((target - merged[i][0]) /merged[i][1]));
               // System.out.println(stack.peek());
               System.out.println("in if else");
            }else{
                stack.push((double) ((double)(target - merged[i][0]))/(double)merged[i][1]);
            }
            System.out.println(stack.toString() + " stack");
        }

        return stack.size();
        
    }
    
    public static  void Sort2DArrayBasedOnColumnNumber (int[][] array, final int columnNumber){
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
               if(first[columnNumber-1] < second[columnNumber-1]) return 1;
               else return -1;
            }
        });
    }
}
