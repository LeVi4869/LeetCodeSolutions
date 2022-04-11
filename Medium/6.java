import java.util.*;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Character>[] list = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            list[i] = new ArrayList<Character>();
        }
        boolean down = true;
        int iter = 0;
        for (char c : s.toCharArray()) {
            list[iter].add(c);
            if (down) {
                if (iter == numRows - 1) {
                    iter = numRows - 2;
                    down = false;
                } else {
                    iter++;
                }
            } else {
                if (iter == 0) {
                    iter = 1;
                    down = true;
                } else {
                    iter--;
                }
            }
        }
        for (List<Character> lst : list) {
            for (char c : lst) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}