class Solution {
    int max = 0;
    public int maxAreaOfIsland(int[][] grid) {
        max = 0;
        for(int i = 0; i < grid.length; ++i)    {
            for(int j = 0; j < grid[0].length; ++j) {
                if(grid[i][j] == 1) {
                    max = Math.max(dfs(grid, i, j), max);
                }
            }
        }
        return max;
    }
    public static int dfs(int[][] grid, int i, int j)  {
        if(grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int res = 1;
        if(i > 0)   {
            res += dfs(grid, i - 1, j);
        }
        if(i < grid.length - 1) {
            res += dfs(grid, i + 1, j);
        }
        if(j > 0)   {
            res += dfs(grid, i, j - 1);
        }
        if(j < grid[0].length - 1)  {
            res += dfs(grid, i, j + 1);
        }
        return res;
    }
}