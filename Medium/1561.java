class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int len = piles.length;
        int res = 0;
        for(int i = 0; i < len / 3; ++i) {
            res += piles[len - 2 * (i + 1)];
        }
        return res;
    }
}