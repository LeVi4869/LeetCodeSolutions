class Solution {
    public int trailingZeroes(int n) {
        int twoFactor = 0, fiveFactor = 0;
        for(int i = 1; i <= n; i++)
        {
            int k = i;
            while(k % 5 == 0)
            {
                k = k / 5;
                fiveFactor++;
            }
        }
        return fiveFactor;
    }
}