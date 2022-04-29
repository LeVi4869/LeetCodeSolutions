class Solution {
    public int minSteps(String s, String t) {
        int cnt1[] = new int[26];
        int cnt2[] = new int[26];
        for(int i = 0; i < s.length(); ++i) {
            ++cnt1[s.charAt(i) - 'a'];
        }
        for(int i = 0; i < t.length(); ++i) {
            ++cnt2[t.charAt(i) - 'a'];
        }
        int res = 0;
        for(int i = 0; i < 26; ++i) {
            res += Math.abs(cnt1[i] - cnt2[i]);
        }
        return res;
    }
}