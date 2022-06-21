class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; ++i) {
            int temp = 0;
            for(int[] coord : points)   {
                if((coord[0] - queries[i][0]) * (coord[0] - queries[i][0]) + (coord[1] - queries[i][1]) * (coord[1] - queries[i][1]) <= queries[i][2] * queries[i][2])  {
                    ++temp;
                }
            }
            res[i] = temp;
        }
        return res;
    }
}