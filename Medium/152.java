class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for(int c : nums)   {
            if(c < 0)   {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(c, max * c);
            min = Math.min(c, min * c);
            res = Math.max(res, max);
        }
        return res;
    }
}