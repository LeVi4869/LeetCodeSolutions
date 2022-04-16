class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int lim = matrix[0].length * matrix.length;
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bot = matrix.length - 1;
        while(left <= right && top <= bot)    {
            for(int i = left; i <= right; ++i)  {
                res.add(matrix[top][i]);
                if(res.size() == lim)
                    return res;
            }
            top++;
            for(int i = top; i <= bot; ++i)    {
                res.add(matrix[i][right]);
                if(res.size() == lim)
                    return res;
            }
            right--;
            for(int i = right; i >= left; --i)  {
                res.add(matrix[bot][i]);
                if(res.size() == lim)
                    return res;
            }
            bot--;
            for(int i = bot; i >= top; --i) {
                res.add(matrix[i][left]);
                if(res.size() == lim)
                    return res;
            }
            left++;
        }
        return res;
    }
}