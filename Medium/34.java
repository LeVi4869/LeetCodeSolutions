class Solution {
    private int binSearch(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length;
        if (left == true) {
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] >= target)
                    high = mid;
                else
                    low = mid + 1;
            }
        } else {
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] > target)
                    high = mid;
                else
                    low = mid + 1;
            }
        }
        return low;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        int leftIndex = binSearch(nums, target, true);
        int rightIndex = binSearch(nums, target, false) - 1;
        if (leftIndex == nums.length || nums[leftIndex] != target)
            return result;
        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;
    }
}