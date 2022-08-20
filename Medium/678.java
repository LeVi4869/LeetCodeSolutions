class Solution {
    public boolean checkValidString(String s) {
        int max = 0;
        int min = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '(')  {
                ++max;
                ++min;
            }
            else if(s.charAt(i) == ')')    {
                --max;
                min = Math.max(min - 1, 0);
            }
            else    {
                ++max;
                min = Math.max(min - 1, 0);
            }
            if(max < 0) {
                return false;
            }
        }
        if(max >= 0 && min <= 0)  {
            return true;
        }
        return false;
    }
}