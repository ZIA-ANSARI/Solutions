import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
         int[] arr = new int[]{1, 2, 3, 4};
        //longestConsecutiveSequence.longestConsecutiveSequence(arr);
        System.out.println(longestConsecutiveSequence.longestConsecutiveSequence(arr));
        
    }

    public static int longestConsecutiveSequence(int[] nums){
        Integer ans = 0;
        Arrays.sort(nums);
        List<Integer> diff = new ArrayList<Integer>();
        int counter = 1;
        for(int k=1; k< nums.length ; k++){
            if(nums[k]-nums[k-1] ==1  ){
                counter++;
            }else{
                counter = 0;
            }
            
            ans = Math.max(ans, counter);
        }
        return ans;
    }
}
