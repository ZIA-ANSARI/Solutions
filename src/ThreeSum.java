import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ThreeSum {

    public static void main(String[] args) {
        int[] question =new int[]{-2,0,1,1,2};
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(question));
        
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums.toString());
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            if(i != 0 && nums[i-1] == nums[i] )
            continue;
            int start = i+1;
            int end = nums.length-1;
            int target = -1*nums[i];
            while(start < end){
                if(nums[start] + nums[end] > target)
                end--;
            else if(nums[start] + nums[end] < target)
                start++;
            else{
                List<Integer> temp = Arrays.asList(nums[i], nums[start], nums[end]);
                set.add(temp);
                //System.out.println(temp);
                end--;
                start++;
            }
            }
        }
       
      return set.stream().collect(Collectors.toList());  
    }
    
}
