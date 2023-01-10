class Solution {
    public int matrixScore(int[][] grid) {
        for(int i = 0; i < grid.length; ++i){
            if(grid[i][0] == 0){
                for(int j = 0; j < grid[i].length; ++j){
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        for(int j = 0; j < grid[0].length; ++j){
            int cnt = 0;
            for(int i = 0; i < grid.length; ++i){
                if(grid[i][j] == 0){
                    ++cnt;
                }
            }
            if(cnt > grid.length / 2){
                for(int i = 0; i < grid.length; ++i){
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        int res = 0;
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[i].length; ++j){
                if(grid[i][j] == 1){
                    res+=Math.pow(2, grid[i].length - j - 1);
                }
            }
        }
        return res;
    }
}