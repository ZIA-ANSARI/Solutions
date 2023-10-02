package Stacks;
//not yet solved
import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        System.out.println(simplifyPath.simplifyPath("/home//foo"));
        // simplifyPath.simplifyPath("/home/");
    }

    public String simplifyPath(String path) {
        String ans = "";
        Stack temp = new Stack<String>();
        String curr = "";
        path = path + "/";
        char[] characters = path.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '/') {
                if (curr.equals("..")) {
                    if (!temp.empty()) {
                        temp.pop();
                        curr = "";
                    }else{
                        curr = "";
                    }
                } else if (curr != "." && curr != "") {

                    temp.push(curr);
                }

                curr = "";

            } else {

                curr = curr + characters[i];
            }
        }
        if(temp.empty()){
            return "/";
        }
        Object[] arr = temp.toArray();
        for (Object arr2 : arr) {
            ans =   ans + "/" + arr2.toString();
        }
        System.out.println(ans);
        return ans;
        //return ans;
    }
}
