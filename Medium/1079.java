class Solution {
    public int numTilePossibilities(String tiles) {
        int[] cnt = new int[26];
        for(char c : tiles.toCharArray()){
            cnt[c - 'A']++;
        }
        return backtrack(cnt);
    }

    private int backtrack(int[] cnt){
        int res = 0;
        for(int i = 0; i < 26; ++i){
            if(cnt[i] == 0){
                continue;
            }
            ++res;
            --cnt[i];
            res+=backtrack(cnt);
            ++cnt[i];
        }
        return res;
    }
}