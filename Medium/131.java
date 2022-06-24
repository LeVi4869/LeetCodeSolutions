class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s, res, new ArrayList<>());
        return res;
    }
    public void backtrack(String s, List<List<String>> res, List<String> temp)  {
        if(s == null || s.length() == 0)   {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 1; i <= s.length(); ++i) {
            String mid = s.substring(0, i);
            if(isPalindrome(mid))   {
                temp.add(mid);
                backtrack(s.substring(i, s.length()), res, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public boolean isPalindrome(String s)   {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right))   {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}