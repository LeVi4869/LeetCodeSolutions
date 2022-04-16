class Solution {
    public int GCD(int a, int b)
    {
        if(a == 0)
        return b;
        if(b == 0)
        return a;
        if(a == b)
        return a;
        else if(a > b)
        return GCD(a-b,b);
        else
        return GCD(a,b-a);
    }
    
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k == 0)
            return;
        else if(GCD(k, nums.length) != 1)
        {
            for(int i = 0; i < GCD(k, nums.length); i++)
            {
                int startIndex = i;
                int prevValue = nums[i];
                do
                {
                    int newIndex = (startIndex + k)%nums.length;
                    int temp = nums[newIndex];
                    nums[newIndex] = prevValue;
                    prevValue = temp;
                    startIndex = newIndex;
                }
                while(startIndex != i);
            }
        }
        else
        {
            int startIndex = 0;
            int prevValue = nums[0];
            do
                {
                    int newIndex = (startIndex + k)%nums.length;
                    int temp = nums[newIndex];
                    nums[newIndex] = prevValue;
                    prevValue = temp;
                    startIndex = newIndex;
                }
                while(startIndex != 0);
        }
    }
}