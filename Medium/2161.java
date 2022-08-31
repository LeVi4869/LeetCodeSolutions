class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int[] res = new int[len];
        for(int i = 0; i < len; ++i){
            if(nums[i] < pivot){
                res[left] = nums[i];
                ++left;
            }
        }
        for(int i = len - 1; i >= 0; --i){
            if(nums[i] > pivot){
                res[right] = nums[i];
                --right;
            }
        }
        for(int i = left; i <= right; ++i){
            res[i] = pivot;
        }
        return res;
    }
}