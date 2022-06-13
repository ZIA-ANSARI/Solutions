public class RotateArray {

    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          RotateArray rotateArray = new RotateArray();
          int[] nums = new int[]{1,2,3,4,5,6,7,8};
          rotateArray.rotate(nums, 3);
          for(int k : nums){
              System.out.println(k + ": index");
          }
    }

    public void rotate(int[] nums, int k) {
        k = nums.length%k;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        
    }
    
    public void reverse(int[] nums, int start, int end){
        int temp = 0;
        while(start < end)
        {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}
