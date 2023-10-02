package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println("working");
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Integer ans = 1;
        Set<Integer> questionSet = new HashSet<>();
      for (int nums2 : nums) {
        questionSet.add(nums2);
      }

      for (int i = 0; i < nums.length; i++) {
        if(!questionSet.contains(nums[i]-1)){
            int temp = nums[i]-1;
            int currLen = 0;
            while(questionSet.contains(temp+1)){
                temp++;
                currLen++;
            }
            if(currLen>ans){
                ans = currLen;
            }
        }
      }
        return ans;
    }
}
