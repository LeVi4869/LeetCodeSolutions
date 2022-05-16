class Solution {
    public long appealSum(String s) {
        long total = 0, curr = 0;
        long prev[] = new long[26];
        for(int i = 0; i < s.length(); ++i) {
            curr += i + 1 - prev[s.charAt(i) - 'a'];
            prev[s.charAt(i) - 'a'] = i + 1;
            total += curr;
        }
        return total;
    }
}