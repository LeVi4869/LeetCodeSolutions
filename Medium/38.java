class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        else {
            String s = countAndSay(n - 1);
            char currChar = s.charAt(0);
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == currChar) {
                    count++;
                } else {
                    sb.append(count).append(currChar);
                    count = 1;
                    currChar = s.charAt(i);
                }
                if (i == s.length() - 1) {
                    sb.append(count).append(currChar);
                }
            }
            return sb.toString();
        }
    }
}