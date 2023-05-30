package Leetcodes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IsValidSudoku {

    public static void main(String[] args) {

        //100% correct

        char board[][] = {
                {'.','.','.','.','.','.','.','.','.'},
                {'6','.','9','.','.','8','.','.','.'},
                {'.','.','.','4','.','6','.','.','.'},
                {'.','.','.','.','.','.','.','1','.'},
                {'.','.','.','.','2','.','.','3','.'},
                {'.','4','.','.','.','.','.','.','4'},
                {'5','.','.','6','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','7','.','6','.','.'}};

        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board) {

        //checks the lines
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length - 1; j++) {
                for (int k = j + 1; k < board.length; k++) {
                    if (board[i][j] != '.' && board[i][j] == board[i][k])
                        return false;
                }
                for (int k = j + 1; k < board.length; k++) {
                    if (board[j][i] != '.' && board[j][i] == board[k][i])
                        return false;
                }
            }
        }

        //checks the 3x3 matrices
        for (int i = 0; i < 9; i++) {
            HashSet<Character> occurredNums = new HashSet<>();
            for (int j = (i * 3) % 9; j < (i * 3) % 9 + 3; j++) {
                for (int k = (i / 3) * 3; k < (i / 3) * 3 + 3; k++) {
                    if(board[j][k] != '.' && occurredNums.contains(board[j][k]))
                        return false;
                    else
                        occurredNums.add(board[j][k]);
                }
            }
        }

        return true;

    }

}
