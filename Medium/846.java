class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : hand)   {
            queue.add(i);
        }
        while(queue.size() != 0)    {
            int groupStart = queue.poll();
            for(int i = 1; i < groupSize; ++i)  {
                if(queue.remove(groupStart + i))    {
                    continue;
                }
                else    {
                    return false;
                }
            }
        }
        return true;
    }
}