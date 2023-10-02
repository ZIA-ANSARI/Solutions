package BinarySearch;

import javax.lang.model.util.ElementScanner6;

public class SearchRotatedArray {

    public static void main(String[] args) {
        SearchRotatedArray searchRotatedArray = new SearchRotatedArray();
        int[] question = new int[]{4,5,6,7,8,1,2,3
            };
        System.out.println(
        searchRotatedArray.search(question, 8));
        
    }
    public int search(int[] nums, int target) {
        int l=0, r =nums.length-1;
        int mid = 0;
        
        //search pivot
        while(l<r){
            mid = (l+r)/2;
            if(nums[mid] > nums[r])
                l = mid+1;
            else
                r = mid;
        }
        int start = l; //left is start point
        r = nums.length-1;
        l=0;
        if(target >= nums[start] && target <= nums[r])
            l = start;
        else
            r = start-1;

        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                r = mid -1;
            else
                l = mid+1;
        }

        return -1;
    }
    
}


/*
 * 56780-1-234
 */