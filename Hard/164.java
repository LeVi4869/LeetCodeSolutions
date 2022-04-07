class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int maxLen = 0;
        for (int i = 1; i < nums.length; ++i) {
            maxLen = Math.max(maxLen, nums[i] - nums[i - 1]);
        }
        return maxLen;
    }
}