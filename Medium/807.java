class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int res = 0;
        int[] col = new int[grid.length];
        int[] row = new int[grid[0].length];
        for(int i = 0; i < grid.length; ++i)    {
            for(int j = 0; j < grid[0].length; ++j) {
                col[i] = Math.max(col[i], grid[i][j]);
                row[j] = Math.max(row[j], grid[i][j]);
            }
        }
        for(int i = 0; i < grid.length; ++i)    {
            for(int j = 0; j < grid[0].length; ++j) {
                int temp = Math.min(col[i], row[j]);
                res += temp - grid[i][j];
            }
        }
        return res;
    }
}