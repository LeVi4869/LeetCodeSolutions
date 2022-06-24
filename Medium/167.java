class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            if(numbers[left] + numbers[right] == target)  {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
            else if(numbers[left] + numbers[right] < target)    {
                ++left;
            }
            else    {
                --right;
            }
        }
        return res;
    }
}