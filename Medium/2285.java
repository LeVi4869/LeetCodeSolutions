class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long cnt[] = new long[n];
        long res = 0;
        for(int i = 0; i < roads.length; ++i) {
            cnt[roads[i][0]]+=1;
            cnt[roads[i][1]]+=1;
        }
        Arrays.sort(cnt);
        for(int i = 0; i < n; ++i) {
            res += (i + 1) * cnt[i];
        }
        return res;
    }
}