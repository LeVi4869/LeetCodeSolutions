class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] count = new int[len + 1];
        for(int citation : citations)   {
            if(citation < len) {
                count[citation]++;
            }
            else    {
                count[len]++;
            }
        }
        int largerCnt = 0;
        for(int i = len; i >= 0; --i)   {
            largerCnt += count[i];
            if(i <= largerCnt)  {
                return i;
            }
        }
        return 0;
    }
}