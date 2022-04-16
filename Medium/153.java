class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        while(left < right) {
            if(nums[left] < nums[right])    {
                return nums[left];
            }
            else    {
                if(nums[mid] >= nums[left])  {
                    left = mid + 1;
                }
                else    {
                    right = mid;
                }
                mid = left + (right - left) / 2;
            }
        }
        return nums[mid];
    }
}