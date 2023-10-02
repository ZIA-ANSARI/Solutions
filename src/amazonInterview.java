import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class amazonInterview {
    
    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          List<Integer> ans = new ArrayList<>();
          ans.add(1);
          ans.add(0);
          ans.add(1);
          ans.add(0);
          ans.add(1);
          amazonInterview AmazonInterview = new amazonInterview();
          List<Integer> ques= AmazonInterview.predictDays(ans, 1);
          for(int i =0; i< ques.size();i++)
          System.out.println(ques.get(i) + "ans");
    }
    public  List<Integer> predictDays(List<Integer> day, int k) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        int curr =0;
        boolean NA = false;
        Stack<Integer> temp = new Stack<>();
        for(int i = k; i < day.size()-k; i++){
            NA = false;
            curr = i;
            for(int j =0 ; j < k; j++){
                
                curr -= j;
               // if(curr)
                if(day.get(curr) >= day.get(i)){
                    if(temp.isEmpty()){
                        temp.push(day.get(curr));
                    }
                    else if(day.get(curr) <= temp.peek()){
                        temp.push(day.get(curr));
                    }
                    else{
                        NA = true;
                        break;
                    }
                }
                      
            
            }
            curr = i;
            if(!temp.isEmpty()){
            for(int j =0 ; j < k; j++){
                
                curr += j;
                if(day.get(curr) >= day.get(i)){
                    if(!temp.isEmpty()){
                    if(day.get(curr) >= temp.peek()){
                        temp.pop();
                    }
                }
                    else{
                        NA = true;
                        break;
                    }
                }             
            
            }
        }
        if(!NA && temp.isEmpty()){
            ans.add(i+1);
        }
    }
    System.out.println(ans);
        return ans;
        }
}
