class Solution {
    public int trap(int[] height) {
        int left_ind = 0, right_ind = height.length - 1;
        int left_max = 0, right_max = 0;
        int res = 0;
        while (left_ind < right_ind) {
            if (height[left_ind] > height[right_ind]) {
                if (height[right_ind] >= right_max) {
                    right_max = height[right_ind];
                } else {
                    res += (right_max - height[right_ind]);
                }
                --right_ind;
            } else {
                if (height[left_ind] >= left_max) {
                    left_max = height[left_ind];
                } else {
                    res += (left_max - height[left_ind]);
                }
                ++left_ind;
            }
        }
        return res;
    }
}