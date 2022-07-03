import java.util.ArrayList;
import java.util.List;

public class MaximumSlidingwindow {
    public static void main(String[] args) {
        
    }

    public List<Integer> maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int r = l+k;
        int posi = 0;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j<=r;j++ ){
            if(max < nums[j]){
                posi =j;
                max = nums[j];
            }
        }
        l++;
        r++;
        while(r<nums.length){
            if(posi == l){
                
            }
        }
        return list;
    }
}
