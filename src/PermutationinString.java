import java.util.Arrays;
import java.util.HashMap;

public class PermutationinString {
    
    public static void main(String[] args) {
        PermutationinString permutationinString = new PermutationinString();
        System.out.println( permutationinString.checkInclusion("ng", "string"));
        permutationinString.checkInclusion("ng", "string");
    }

    public boolean checkInclusion(String s1, String s2) {
        boolean ans = false;
        char[] smol = s1.toCharArray();
        char[] big = s2.toCharArray();
        int left = 0;
        int right = left + smol.length;
        HashMap<Character, Integer> hashSmall = new HashMap<>();
        for(char c : smol){
                hashSmall.computeIfPresent(c, (k, v)-> v+1);
                hashSmall.computeIfAbsent(c, k -> 1);
        }
        HashMap<Character, Integer> temp = new HashMap<>();
        System.out.println(hashSmall);
        for(int i = 0; i<=(big.length - smol.length); i++){
            left = i;
            right = i+ smol.length;
            temp = (HashMap<Character, Integer>) hashSmall.clone();
            while(left < big.length && temp.containsKey(big[left]) && temp.get(big[left]) > 0){
                temp.computeIfPresent(big[left], (k, v)-> v-1);
                left++;
            }
            if(left == right){
                return true;
            }
           

        }
        return ans;
    }
}

