class Solution {
    int[][] dp;

    public int maxCoins(int[] nums) {
        dp = new int[nums.length][nums.length];
        return helper(nums, 0, nums.length - 1);
    }

    public int helper(int[] arr, int start, int end) {
        if (start > end) {
            return 0;
        }
        if (dp[start][end] != 0) {
            return dp[start][end];
        }
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; ++i) {
            int temp = helper(arr, start, i - 1) + ((start - 1 < 0) ? 1 : arr[start - 1]) * arr[i]
                    * ((end + 1 >= arr.length) ? 1 : arr[end + 1]) + helper(arr, i + 1, end);
            max = Math.max(max, temp);
        }
        dp[start][end] = max;
        return max;
    }
}