import java.util.*;

class Solution {
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int goal = n * n;
        int curr = 1;
        int upBorder = 0;
        int rightBorder = n - 1;
        int downBorder = n - 1;
        int leftBorder = 0;
        int currX = 0, currY = 0;
        while (curr <= goal) {
            for(int i = leftBorder; i <= rightBorder; ++i)  {
                res[upBorder][i] = curr;
                ++curr;
            }
            ++upBorder;
            for(int i = upBorder; i <= downBorder; ++i)  {
                res[i][rightBorder] = curr;
                ++curr;
            }
            --rightBorder;
            for(int i = rightBorder; i >= leftBorder; --i)  {
                res[downBorder][i] = curr;
                ++curr;
            }
            --downBorder;
            for(int i = downBorder; i >= upBorder; --i)  {
                res[i][leftBorder] = curr;
                ++curr;
            }
            ++leftBorder;
        }
        return res;
    }

}
