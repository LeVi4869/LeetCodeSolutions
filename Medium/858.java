class Solution {
    public static int mirrorReflection(int p, int q) {
        int currHeight = 0;
        boolean left = true;
        boolean up = true;
        while(true) {
            if(up)  {
                currHeight += q;
                if(currHeight > p)  {
                    up = !up;
                    currHeight = p - currHeight % p;
                }
            }
            else    {
                currHeight -= q;
                if(currHeight <= 0)  {
                    up = !up;
                    currHeight = -currHeight;
                }
            }
            left = !left;
            if(currHeight == p) {
                if(left)    {
                    return 2;
                }
                else    {
                    return 1;
                }
            }
            else if(currHeight == 0 && !left)   {
                return 0;
            }
        }
    }
}