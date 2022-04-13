class Solution {
    public boolean exist(char[][] board, String word) {
        /* Find word's first letter. Then call method to check it's surroundings */
        for (int r = 0; r < board.length; r++)
            for (int c = 0; c < board[0].length; c++)
                if (word.charAt(0) == board[r][c] && help(board, word, r, c, 0))
                    return true;

        return false;
    }

    public boolean help(char[][] b, String w, int r, int c, int index) {
        /* once we get past word.length, we are done. */
        if (index == w.length())
            return true;

        /*
         * if off bounds, letter is seen, letter is unequal to word.charAt(start) return
         * false
         */
        if (r < 0 || r >= b.length || c < 0 || c >= b[0].length || w.charAt(index) != b[r][c])
            return false;

        /* set this board position to seen. (Because we can use this postion) */
        b[r][c] = '0';

        /* recursion on all 4 sides for next letter, if works: return true */
        if (help(b, w, r - 1, c, index + 1) || help(b, w, r + 1, c, index + 1) || help(b, w, r, c - 1, index + 1)
                || help(b, w, r, c + 1, index + 1))
            return true;

        /* Set back to unseen */
        b[r][c] = w.charAt(index);

        return false;
    }

}