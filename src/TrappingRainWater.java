

public class TrappingRainWater{
    
    public static void main(String[] args) {
        int[] question = new int[]{
            0,1,0,2,1,0,1,3,2,1,2,1
        };
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(
        trappingRainWater.trap(question));
    }

    public int trap(int[] height) {
        
        int maxLeft = height[0];
        int maxRight = height[height.length-1];
        int ans = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            if(maxLeft < maxRight){
                left++;
                ans += (maxLeft -height[left]) > 0 ? maxLeft -height[left] : 0;
                maxLeft=Math.max(height[left], maxLeft);
            }
            else{
                right--;
                ans+= maxRight -height[right] > 0? maxRight -height[right] : 0 ;
                maxRight=Math.max(height[right], maxRight);
            }
        }
        



        
        return ans;
    }
}