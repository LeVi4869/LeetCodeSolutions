class Solution {
    public String getHint(String secret, String guess) {
        int cnt1[] = new int[10];
        int cnt2[] = new int[10];
        int bullCnt = 0;
        int cowCnt = 0;
        for(int i = 0; i < secret.length(); ++i)    {
            if(secret.charAt(i) == guess.charAt(i)) {
                ++bullCnt;
            }
            else    {
                cnt1[secret.charAt(i) - '0']++;
                cnt2[guess.charAt(i) - '0']++;
            }
        }
        for(int i = 0; i < 10; ++i) {
            cowCnt += Math.min(cnt1[i], cnt2[i]);
        }
        String res = bullCnt + "A" + cowCnt + "B";
        return res;
    }
}