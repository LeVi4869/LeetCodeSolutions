class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bot = matrix.length - 1;
        int row = 0;
        while(top <= bot)    {
            int mid = top + (bot - top) / 2;
            System.out.println(matrix[mid][0]);
            if(matrix[mid][0] == target)    {
                return true;
            }
            else if(matrix[mid][0] > target) {
                bot = mid - 1;
            }
            else    {
                if(mid == bot)  {
                    row = mid;
                    break;
                }
                if(matrix[mid + 1][0] == target) {
                    return true;
                }
                if(matrix[mid + 1][0] > target) {
                    row = mid;
                    break;
                }
                else    {
                    top = mid + 1;
                }
            }
        }
        int left = 0;
        int right = matrix[0].length - 1;
        while(left <= right)    {
            int mid = left + (right - left) / 2;
            System.out.println(matrix[row][mid]);
            if(matrix[row][mid] == target)    {
                return true;
            }
            else if(matrix[row][mid] > target)  {
                right = mid - 1;
            }
            else    {
                left = mid + 1;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        searchMatrix(mat, 13);
    }
}