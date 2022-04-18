class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0)   {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int last = intervals[0][1];
        int res = 0;
        for(int i = 1; i < intervals.length; ++i)   {
            if(intervals[i][0] < last)  {
                res++;
                last = Math.min(last, intervals[i][1]);
            }
            else    {
                last = intervals[i][1];
            }
        }
        return res;
    }
}