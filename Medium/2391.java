class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int res = 0;
        int lastP = 0;
        int lastM = 0;
        int lastG = 0;
        for(int i = 0; i < garbage.length; ++i) {
            res += garbage[i].length();
            for(int j = 0; j < garbage[i].length(); ++j)    {
                if(garbage[i].charAt(j) == 'P') {
                    lastP = i;
                }
                else if(garbage[i].charAt(j) == 'M') {
                    lastM = i;
                }
                else if(garbage[i].charAt(j) == 'G') {
                    lastG = i;
                }
            }
        }
        System.out.println(lastG);
        for(int i = 1; i < travel.length; ++i){
            travel[i] += travel[i - 1];
        }
        if(lastP > 0)   {
            res += travel[lastP - 1];
        }
        if(lastM > 0)   {
            res += travel[lastM - 1];
        }
        if(lastG > 0)   {
            res += travel[lastG - 1];
        }
        return res;
    }
}