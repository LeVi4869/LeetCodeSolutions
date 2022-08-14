class Solution {
    public int minCostConnectPoints(int[][] points) {
        int ans = 0;
        int n = points.length;
        HashSet<Integer> mst = new HashSet<>();
        mst.add(0);
        int[] minDist = new int[n];
        for(int i = 1; i < n; ++i)  {
            minDist[i] = distance(points, 0, i);
        }
        while(mst.size() < n)   {
            int index = -1;
            for(int i = 1; i < n; ++i)  {
                if(mst.contains(i)) {
                    continue;
                }
                if(index == -1 || minDist[i] < minDist[index])    {
                    index = i;
                }
            }
            mst.add(index);
            ans += minDist[index];
            for(int i = 1; i < n; ++i)  {
                if(!mst.contains(i))    {
                    minDist[i] = Math.min(minDist[i], distance(points, index, i));
                }
            }
        }
        return ans;
    }
    public static int distance(int[][] points, int a, int b) {
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }
}