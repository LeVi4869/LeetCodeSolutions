class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                if(grid[i][j] == 1){
                    row[i]++;
                }
                else{
                    row[i]--;
                }
            }
        }
        for(int j = 0; j < grid[0].length; ++j){
            for(int i = 0; i < grid.length; ++i){
                if(grid[i][j] == 1){
                    col[j]++;
                }
                else{
                    col[j]--;
                }
            }
        }
        int[][] res = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                res[i][j] = row[i] + col[j];
            }
        }
        return res;
    }
}