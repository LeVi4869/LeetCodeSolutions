class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int res = 0;
        int remaining = capacity;
        for(int i = 0; i < plants.length; ++i)  {
            if(plants[i] <= remaining)   {
                ++res;
                remaining -= plants[i];
            }
            else    {
                res += i;
                res += i + 1;
                remaining = capacity - plants[i];
            }
        }
        return res;
    }
}