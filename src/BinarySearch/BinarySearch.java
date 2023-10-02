package BinarySearch;
public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch nBinarySearch = new BinarySearch();
        System.out.println(nBinarySearch.search(new int[]{2,5}, 5));
    }

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1 ;
        int mid = (left + right) / 2;
        
        if(nums.length == 1 && nums[0] ==  target){
            return 0;
        }
        while(left <= right){
            mid = (right+left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid-1;
            } else{
                left = mid+1;
            }
        }

        return -1;
        
    }
    
}
