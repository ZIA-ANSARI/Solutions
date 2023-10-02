package Arrays;
public class ContainerWithMostWater {
    
    public static void main(String[] args) {
        
    }

    public int maxArea(int[] height) {
        
        int ans =0;
        int left = 0;
        int right = height.length;
        while(left<right){
            int curr = Math.min(height[left], height[right])*(right-left);
            ans = Math.max(ans, curr);
        }
        if(height[left]<=height[right]){
            left++;
        }else{
            right--;
        }
        return ans;
    }
}
