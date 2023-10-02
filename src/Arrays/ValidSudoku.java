package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String args[]){
        System.out.println("runing nice and steady");

    }

    public boolean isValidSudoku(char[][] board) {

        Set<Character> rowSet = null;
        Set<Character> columnSet = null;

        for(int i = 0; i < 9; i++){
            rowSet = new HashSet<>();
            columnSet = new HashSet<>();

            for(int j = 0; i < 9; j++){

                Character r = board[i][j];
                char c = board[j][i];

                if(r.is && rowSet.contains(r)){
                    return false;
                }else{


                }
            }

        }
        return false;
    }

}
