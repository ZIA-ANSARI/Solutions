import java.util.ArrayList;

public class zigzagConversion {
    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[] question = new int[]{1,3};
          int[] nums2 = new int[]{2,7};
          zigzagConversion zConversion = new zigzagConversion();
          zConversion.convert("PAYPALISHIRING", 4);


    }
    public String convert(String s, int rows){
        int increment =0;
        StringBuilder ans = new StringBuilder();
        if(rows ==1){
            return s;
        }
        else{
            for(int j = 0; j < rows; j++){
                ans.append(s.charAt(j));
            for(int i = j ; i< s.length(); i+=0){
                if(j > 0 && j < rows-1){
                    increment = i + (rows-1- (i%(rows-1)))*2;
                    if(increment < s.length())
                    ans.append(s.charAt(increment)) ;
                }
                increment = i + (rows-1)*2;
                if(increment < s.length())
                ans.append(s.charAt(increment)) ;
                i = increment;
                System.out.println(ans.toString());
            }
        }
    }


        
        return ans.toString();
    }
}
