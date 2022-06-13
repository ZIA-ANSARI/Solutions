import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TopKElements {
    
    public static void main(String[] args) {
        TopKElements topKElements = new TopKElements();
        int[] question = new int[]{1,2};
        topKElements.topKFrequent(question, 2);

    }
    
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        int ptr = 0;

        for(int n: nums){
            map.computeIfPresent(n, (key,value)->  value+1);
            map.computeIfAbsent(n, key -> 1 );
        }
        ArrayList<Integer>[] buckets = (ArrayList<Integer>[]) new ArrayList[nums.length+1];
        map.forEach((key,value) ->System.out.println(key + " : " + value));
        map.forEach((key,value) ->{
        if(buckets[value] ==null) {
        ArrayList<Integer> temp =  new ArrayList<Integer>();
        temp.add(key);
        buckets[value] = temp;
        }
        else{
            ArrayList<Integer> temp = buckets[value];
            temp.add(key);
            buckets[value] = temp;

        }});

     for(int i = nums.length ; i >= 0; i--){
         if(buckets[i] != null && ptr < k ){
               for(int n : buckets[i]){
                   if(ptr<k){
                   res[ptr] = n;
                   ptr++;
                   }
               }

         }else if(ptr >= k){
             break;
         }
        }
        for ( int n : res) {
            System.out.println(n);        
            }
     System.out.println(map);

        return res;
    }
}
