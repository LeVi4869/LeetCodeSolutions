class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] rightExpansion = new int[heights.length];
        int[] leftExpansion = new int[heights.length];
        rightExpansion[heights.length - 1] = heights.length;
        leftExpansion[0] = -1;
        for (int i = 1; i < heights.length; i++) {
            int iter = i - 1;
            while (iter >= 0 && heights[iter] >= heights[i]) {
                iter = leftExpansion[iter];
            }
            leftExpansion[i] = iter;
        }
        for (int i = heights.length - 2; i >= 0; i--) {
            int iter = i + 1;
            while (iter <= heights.length - 1 && heights[iter] >= heights[i]) {
                iter = rightExpansion[iter];
            }
            rightExpansion[i] = iter;
        }
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            res = Math.max(res, (rightExpansion[i] - leftExpansion[i] - 1) * heights[i]);
        }
        return res;
    }
}