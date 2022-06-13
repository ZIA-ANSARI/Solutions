import java.util.HashSet;
import java.util.Set;

public class LargestSubstringWithoutRepeatingCharacters {
    
    public static void main(String[] args) {
        String queString = "abcabbab";
        LargestSubstringWithoutRepeatingCharacters largestSubstringWithoutRepeatingCharacters =new LargestSubstringWithoutRepeatingCharacters();
        largestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(queString);
    }
    public int lengthOfLongestSubstring(String s) {

        int count = 0;
        int currCount = 0;
        int left = 0;
        int right = 0;
        char[] str = s.toCharArray();
        Set<Character> map = new HashSet<>();
        while (right<s.length() && left >= 0) {
            while(map.contains(str[right])&& left >= 0){
                map.remove(str[left]);
                left++;
                System.out.println(left);
            }
            map.add(str[right]);
            right++;
            //currCount = map.size();
            count=Math.max(count, right-left);
            System.out.println(map.toString());
        }
        System.out.println(count);
    
        return count;
    }
}
