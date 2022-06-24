import java.util.ArrayList;
import java.util.List;

/**
 * LongestCommonPrefix
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"flower", "flow"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
        
        
    }
    public String longestCommonPrefix(String[] strs) {
        
        List<Character> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        Character curr = null;
        try{
        for(int i = 0 ; i <=200; i++ ){
            for(int j = 0; j< strs.length ; j++){
                if(j==0)
                    curr= strs[j].charAt(i);
                if(!curr.equals(strs[j].charAt(i))){
                    flag = false;
                    break;
                }
                flag = true;
            }
            if(flag == false)
                break;
            sb.append(curr);
            System.out.println(sb.toString() + "oye");
        }
        }catch(StringIndexOutOfBoundsException e){
            return sb.toString();
        }
        
        
        return sb.toString();
    }
}