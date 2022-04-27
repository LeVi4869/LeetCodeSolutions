class Solution {
    public int countCollisions(String directions) {
        int res = 0;
        int currCnt = 0;
        boolean obstacle = false;
        for(int i = 0; i < directions.length(); ++i)    {
            if(directions.charAt(i) == 'R') {
                ++currCnt;
                obstacle = true;
            }
            if(directions.charAt(i) == 'S') {
                res += currCnt;
                currCnt = 0;
                obstacle = true;
            }
            if(directions.charAt(i) == 'L') {
                res += currCnt;
                if(obstacle)
                    res += 1;
                currCnt = 0;
            }
        }
        return res;
    }
}