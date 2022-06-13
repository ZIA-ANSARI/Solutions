import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class twosum {

    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[] question = new int[]{3,3};
          int[] nums2 = new int[]{2,7};
          twosum twosum = new twosum();
          System.out.println( Arrays.toString(twosum.twoSum(question, 6)));
    }
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hashMap.containsKey(target - nums[i])){
                hashMap.put(nums[i], i);
            } else {
                int[] result = {i, hashMap.get(target - nums[i])};
                return result;
            }
        }
    return null;
    }
    
}
