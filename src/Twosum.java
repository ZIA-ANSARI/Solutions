import java.util.*;
import java.lang.*;
import java.io.*;

public class Twosum {
    
    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[] question = new int[]{3,2,4, 11};
          Twosum twosum = new Twosum();
          int[] ans = twosum.twoSum(question, 9);
          System.out.println(ans[0]);
          System.out.println(ans[1]);
    }

    public  int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int left =0;
        int right = nums.length-1;
        Arrays.sort(nums);
        while(left<right){
            if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[left] + nums[right] < target){
                left++;
            }else{
                ans[0] = left;
                ans[1] = right;
                return ans;
            }

        }
        
        return ans;
    }
}
