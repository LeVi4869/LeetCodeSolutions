class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        count = 0;
        for(int i = 0; i < s.length(); ++i) {
            helper(s, i, i);
            helper(s, i, i + 1);
        }
        return count;
    }
    public void helper(String s, int left, int right)    {
        if(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))    {
            count++;
            helper(s, left - 1, right + 1);
        } 
    }
}