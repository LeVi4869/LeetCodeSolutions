class Solution {
    public int jump(int[] nums) {
        int furthest = 0;
        int cnt = 0;
        int curr = 0;
        while(curr < nums.length)   {
            if(furthest >= nums.length - 1) {
                return cnt;
            }
            int max = furthest;
            for(int i = curr; i <= max; ++i)   {
                furthest = Math.max(furthest, i + nums[i]);
            }
            ++cnt;
        }
        return cnt;
    }
}