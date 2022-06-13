import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagrams {
    
    public static void main(String[] args) {
        String[] s = new String[]{"eat","tea","tan","ate","nat","bat"};
        GroupOfAnagrams groupOfAnagrams = new GroupOfAnagrams();
        System.out.println(groupOfAnagrams.groupAnagrams(s));
        
    }
    public List<List<String>> groupAnagrams(String[] s){
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> hash = new HashMap<>();
        for(int i = 0 ; i< s.length; i++){
            int[] key = new int[26];
            //ArrayList<Boolean> key = new ArrayList<>(Arrays.asList(false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false));
            char[] temp = s[i].toCharArray();
            for(char c : temp){
               // System.out.println((int) c - 'a');
                key[(int) c - 'a']++;
            }
            String k = Arrays.toString(key);
            System.out.println();
            if(!hash.containsKey(k)){
                ArrayList<String> strs = new ArrayList<>();
                strs.add(s[i]);
                hash.put(k, strs);
                System.out.println("in if");
            }else{
                List<String> strs = hash.get(k);
                strs.add(s[i]);
                hash.put(k, strs);
                System.out.println("else");
            }
        }
        for(List<String> str: hash.values()){
            res.add(str);
        }
        return res;
    }
}
