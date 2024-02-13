class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0;
        int best = 0;
        for(int val : values){
            res = Math.max(res, best + val);
            best = Math.max(best, val) - 1;
        }
        return res;
    }
}