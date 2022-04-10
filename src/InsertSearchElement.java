public class InsertSearchElement {
    
    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[] question = new int[]{3,4,5,6,7,8};
          InsertSearchElement insertSearchElement = new InsertSearchElement();
          insertSearchElement.searchInsert(question, 6);
    }


    public int searchInsert(int[] nums, int target) {
        int temp = nums[0];
        int ans =  binarySearch(nums, target, 0, nums.length-1);
        return ans;
}
        
        public int binarySearch(int[] nums, int target, int start, int end){
            if(end-start > 1){
                int size = (start + end)/2;
                if(nums [size] > target){
                    System.out.println("In first If");
                    System.out.println(size);
                    System.out.println(start + " start" );
                    System.out.println(end + " end");
                    return binarySearch(nums, target, start, size);
                }else if(nums[size] < target){
                     return binarySearch(nums, target, size+1, end);
                }
                else return size;
            }
            else{
                if(nums[start] == target || nums[start] >target){
                    return start;
                }
                else if(nums[end] == target){
                    return end;
                }else if( target > nums[end]){
                    return end +1;
                }
                else if(target > nums[start] && target < nums[end]){
                    return start + 1;
                }
            }
            return 0;
        }
    
}
