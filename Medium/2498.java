class Solution {
    public int maxJump(int[] stones) {
        int res = 0;
        int pos = 2;
        int cur = stones[0];
        while(pos < stones.length){
            int diff = stones[pos] - cur;
            res = Math.max(res, diff);
            cur = stones[pos];
            pos+=2;
        }
        res = Math.max(res, stones[stones.length - 1] - cur);
        pos = 1;
        cur = stones[0];
        while(pos < stones.length){
            int diff = stones[pos] - cur;
            res = Math.max(res, diff);
            cur = stones[pos];
            pos+=2;
        }
        res = Math.max(res, stones[stones.length - 1] - cur);
        return res;
    }
}