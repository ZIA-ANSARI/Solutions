import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MusicPairs {

    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[] question = new int[]{60,60,60, 60};
          
          MusicPairs musicPairs = new MusicPairs();
          musicPairs.numPairsDivisibleBy60(question);
    }
    
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        int temp = 0;
        for(int i =0; i < time.length; i++){
            time[i] = time[i]%60;
            if(map.containsKey(time[i])){
                map.put(time[i], map.get(time[i])+1);
            }else
            map.put(time[i], 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() == 0 || entry.getKey() == 30){
                System.out.print(entry.getValue());
                for(int j =1; j < entry.getValue();j++){
                counter = counter + entry.getValue()-j;}
                System.out.println("In if condition : " + counter);
                entry.setValue(0);
            }
            else{
                if(map.containsKey(Math.abs(60 - entry.getKey()))){
                temp = map.get(Math.abs(60-entry.getKey()));
                counter = counter + entry.getValue() * temp;
                entry.setValue(0);
                map.put(Math.abs(60-entry.getKey()), 0);
                System.out.println("In else condition : " + counter);
            }
        }
    }


        return counter;
}


};//with Integer overflow issue



//Question
// You are given a list of songs where the ith song has a duration of time[i] seconds.
// Return the number of pairs of songs for which their total duration in seconds i
//is divisible by 60. Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.

 

// Example 1:

// Input: time = [30,20,150,100,40]
// Output: 3
// Explanation: Three pairs have a total duration divisible by 60:
// (time[0] = 30, time[2] = 150): total duration 180
// (time[1] = 20, time[3] = 100): total duration 120
// (time[1] = 20, time[4] = 40): total duration 60
// Example 2:

// Input: time = [60,60,60]
// Output: 3
// Explanation: All three pairs have a total duration of 120, which is divisible by 60.
 

// Constraints:

// 1 <= time.length <= 6 * 104
// 1 <= time[i] <= 500
    

