import java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean answer = true;
        for (int i = 0; i <= 8; i++) {
            HashMap<Character, Character> map = new HashMap<Character, Character>();
            for (int j = 0; j <= 8; j++) {
                if (board[i][j] != '.') {
                    if (map.containsKey(board[i][j]) == true)
                        return false;
                    else
                        map.put(board[i][j], ' ');
                }
            }
        }
        for (int j = 0; j <= 8; j++) {
            HashMap<Character, Character> map = new HashMap<Character, Character>();
            for (int i = 0; i <= 8; i++) {
                if (board[i][j] != '.') {
                    if (map.containsKey(board[i][j]) == true)
                        return false;
                    else
                        map.put(board[i][j], ' ');
                }
            }
        }
        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
                HashMap<Character, Character> map = new HashMap<Character, Character>();
                for (int i1 = 0; i1 <= 2; i1++) {
                    for (int j1 = 0; j1 <= 2; j1++) {
                        if (board[i + i1][j + j1] != '.') {
                            if (map.containsKey(board[i + i1][j + j1]) == true)
                                return false;
                            else
                                map.put(board[i + i1][j + j1], ' ');
                        }
                    }
                }

            }
        }
        return true;
    }
}