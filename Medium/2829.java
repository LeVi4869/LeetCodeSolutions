class Solution {
    public int minimumSum(int n, int k) {
        int res = 0;
        int half = k / 2;
        if(n < half){
            return n * (n + 1) / 2;
        }
        res += half * (half + 1) / 2;
        int remaining = n - half;
        res += remaining * (k + k + remaining - 1) / 2;
        return res;
    }
}