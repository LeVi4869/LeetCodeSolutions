class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int remain = 0;
        int sum = 0;
        for(int i = 0; i < gas.length; ++i) {
            sum += (gas[i] - cost[i]);
        }
        if(sum < 0) {
            return -1;
        }
        for(int i = 0; i < cost.length; ++i)    {
            remain += (gas[i] - cost[i]);
            if(remain < 0)  {
                index = i + 1;
                remain = 0;
            }
        }
        return index;
    }
}