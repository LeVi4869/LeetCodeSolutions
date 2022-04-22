class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int len = plantTime.length;
        List<Integer> lst = new ArrayList<Integer>();
        for(int i = 0; i < len; ++i)    {
            lst.add(i);
        }
        Collections.sort(lst, Comparator.comparingInt(i -> -growTime[i]));
        int max = 0;
        int totalPlantTime = 0;
        for(int i = 0; i < len; ++i)    {
            int plant = lst.get(i);
            int temp = totalPlantTime + plantTime[plant] + growTime[plant];
            max = Math.max(max, temp);
            totalPlantTime += plantTime[plant];
        }
        return max;
    }
}