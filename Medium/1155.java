class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][] = new int[31][1001];
        for(int i = 0; i <= n; ++i) {
            for(int j = 0; j <= target; ++j) {
                if(i == 0 && j == 0) {
                    dp[i][j] = 1;
                }
                else if(i == 0 && j != 0)    {
                    dp[i][j] = 0;
                }
                else if(i != 0 && j == 0)   {
                    dp[i][j] = 0;
                }
                else    {
                    int res = 0;
                    for(int val = 1; val <= k; ++val) {
                        if(val > j) {
                            break;
                        }
                        res = (res + dp[i - 1][j - val]) % 1000000007;
                    }
                    dp[i][j] = res % 1000000007;
                }
            }
        }
        return dp[n][target] % 1000000007;
    }
}