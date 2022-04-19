class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for(int i = 1; i <= n; ++i) {
            int temp = Integer.MAX_VALUE;
            for(int j = 1; j * j <= i; ++j) {
                temp = Math.min(temp, dp[i - j * j] + 1);
            }
            dp[i] = temp;
        }
        return dp[n];
    }
}