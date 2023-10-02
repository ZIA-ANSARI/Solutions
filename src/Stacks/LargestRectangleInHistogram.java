package Stacks;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main(String[] args) {
        LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();
        int[] question = new int[]{
            2,4
        };
        System.out.println(largestRectangleInHistogram.largestRectangleInHistogram(question)
        );
    }

    public int largestRectangleInHistogram(int[] heights) {
        int maxArea = 0;
        int curr_pos = 0;
        Stack<Integer> pos = new Stack<>();
        Stack<Integer> hIntegers = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            if (pos.empty() && hIntegers.empty()) {
                pos.push(i);
                hIntegers.push(heights[i]);
            } else if (heights[i] < hIntegers.peek()) {
                while (!hIntegers.empty() && heights[i] < hIntegers.peek()) {
                    curr_pos = pos.pop();
                    maxArea = Math.max(maxArea, hIntegers.pop() * (i - curr_pos));
                    System.out.println(hIntegers.toString() + pos.toString());
                }
                hIntegers.push(heights[i]);
                pos.push(curr_pos);
            } else if (heights[i] > hIntegers.peek()) {
                hIntegers.push(heights[i]);
                pos.push(i);
            }
            /*
             * 2,0 1
             */

        }
        System.out.println(hIntegers.toString() + pos.toString());
        while (!hIntegers.isEmpty()) {

            maxArea = Math.max(maxArea, hIntegers.pop() * (heights.length-pos.pop()));
        }
        return maxArea;

    }
}
