import java.util.*;
import java.lang.*;
import java.io.*;

public class RobotBoundedInBox {
    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[] question = new int[]{3,2,4, 11};
          RobotBoundedInBox robotBoundedInBox = new RobotBoundedInBox();
          Boolean trie = robotBoundedInBox.isRobotBounded("GLLG");
          System.out.println(trie);

          
         
    }

    public boolean isRobotBounded(String instructions) {
        char[] s = instructions.toCharArray();
        int[] cordinate = new int[]{0,0};
        char posi = 'N';
        
        for(int i = 0; i < s.length; i++){
        if(s[i] == 'G' && posi == 'N')
        {
            cordinate[0] = cordinate[0]++;
        }else if(s[i] == 'G' && posi == 'S'){
            cordinate[0] = cordinate[0]--;
        }else if(s[i] == 'G' && posi == 'E'){
                cordinate[1] = cordinate[1]++;
        }else if(s[i] == 'G' && posi == 'W'){
                cordinate[1] = cordinate[1]--;
        }          
        else if(s[0] == 'L'){
            if(posi == 'N')
                posi = 'W';
            else if(posi == 'W')
                posi = 'S';
            else if(posi == 'S'){
                posi = 'E';
            }else if(posi == 'E'){
                posi = 'N';
            }
        }else if(s[0] == 'R'){
            if(posi == 'N')
                posi = 'E';
            else if(posi == 'W')
                posi = 'N';
            else if(posi == 'S'){
                posi = 'W';
            }else if(posi == 'E'){
                posi = 'S';
            }
        }
        }
        System.out.println(cordinate[0]);
        System.out.println(cordinate[1]);
        System.out.println(posi);
        if(cordinate[0] ==0 && cordinate[1] == 0){
        return true;
    }
    else if(cordinate[0] != 0 || cordinate[1] != 0){
        if(posi != 'N')
            return true;
        else return false;
    }
        return false;

    }
}
