import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    
    public static void main(String[] args) {
        EncodeAndDecode encodeAndDecode = new EncodeAndDecode();
        encodeAndDecode.Decode("4Love3you");
        List<String> question = new ArrayList<>();
        question.add("Hammad");
        question.add("zia");
        question.add("ansari");
        encodeAndDecode.Encode(question);
    }

    public static List<String> Decode(String str){
        List<String> ans = new ArrayList<>();
        int index = 0;
        while(index < str.length()){
            Integer length = Integer.parseInt(String.valueOf(str.charAt(index)));
            System.out.println(length);
            String word = str.substring(index+1, index + length+1);
            System.out.println(word);
            index = index + length +1;
            ans.add(word);
        }
        System.out.println(ans);
        return ans;
    }
    
    public static String Encode(List<String> words){
        StringBuilder sb = new StringBuilder();
        for(String str : words){
            sb.append(str.length())
            .append(str);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
