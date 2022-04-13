class Solution {
    public void sortColors(int[] nums) {
        int lastIdx = nums.length - 1;
        int firstIdx = 0;
        int currIdx = 0;
        while (currIdx <= lastIdx) {
            if (nums[currIdx] == 0 && currIdx != firstIdx) {
                nums[currIdx] = nums[firstIdx];
                nums[firstIdx] = 0;
                ++firstIdx;
            } else if (nums[currIdx] == 2) {
                nums[currIdx] = nums[lastIdx];
                nums[lastIdx] = 2;
                --lastIdx;
            } else {
                ++currIdx;
            }
        }
    }
}