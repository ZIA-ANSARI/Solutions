import java.util.*;
import java.lang.*;
import java.io.*;

public class TargetSum {


    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[] question = new int[]{3,2,4, 11};
          TargetSum targetSum = new TargetSum();
          targetSum.findTargetSumWays(question, 7);

    }
    public int findTargetSumWays(int[] nums, int target) {
        int ans = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        arr.add(0, 0);
        arr.add(0);
        System.out.println(arr);
        map.put(arr, 0);
        System.out.println(map);
        ans = recursiveFunction(target, nums.length, map, arr,nums);
        System.out.println(ans + " ans");
        return ans;
    }

    public int recursiveFunction( int target, int size,HashMap<ArrayList<Integer>, Integer> map, ArrayList<Integer> arr, int[] nums){
        int ans = 0;
        if(arr.get(0) == size){
            if (arr.get(1) == target){
                return 1;
            }else 
            return 0;
        }

        if(map.containsKey(arr)){
            return map.get(arr);
        }
        arr.add(1, arr.get(1)+nums[arr.get(0)]);
        arr.add(0, arr.get(0) +1);
        map.put(arr,(recursiveFunction(target, size,map, arr,nums )) +(recursiveFunction(target, size,map, arr,nums )) );
        return ans;

    }
}//unable to solve using dp
