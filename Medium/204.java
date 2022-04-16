class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] available = new boolean[n];
        for(int i = 2; i < n; i++) {
            if(!available[i])   {
                count++;
                for(int j = i; j <  n; j += i)  {
                    available[j] = true;
                }
            }
        }
        return count;
    }
}