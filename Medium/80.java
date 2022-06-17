class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) {
            return nums.length;
        }
        List<Integer> lst = new ArrayList<>();
        lst.add(nums[0]);
        lst.add(nums[1]);
        for(int i = 2; i < nums.length; ++i)    {
            if(nums[i] != nums[i - 2])  {
                lst.add(nums[i]);
            }
        }
        for(int i = 0; i < lst.size(); ++i) {
            nums[i] = lst.get(i);
        }
        return lst.size();
    }
}