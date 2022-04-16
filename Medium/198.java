class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int[] dp = new int[len];
        if(len >= 1) dp[0] = nums[0];
        if(len >= 2) dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < len; ++i)    {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[len - 1];
    }
}