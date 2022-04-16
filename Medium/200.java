class Solution {
    private int n, m;
    public int numIslands(char[][] grid) {
        n = grid.length;
        if(n == 0)
            return 0;
        m = grid[0].length;
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == '1')
                {
                    res++;
                    clear(grid, i, j);
                }
            }
        }
        return res;
    }
    private void clear(char[][] grid, int i, int j)  {
        if(i < 0 || j < 0|| i >= n || j >= m || grid[i][j] != '1')
            return;
        grid[i][j] = '0';
        clear(grid, i - 1, j);
        clear(grid, i, j - 1);
        clear(grid, i + 1, j);
        clear(grid, i, j + 1);
    }
}