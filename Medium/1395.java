class Solution {
    public int numTeams(int[] rating) {
        int res = 0;
        for(int i = 1; i < rating.length - 1; ++i){
            int leftBigger = 0;
            int rightBigger = 0;
            int leftSmaller = 0;
            int rightSmaller = 0;
            for(int j = 0; j < rating.length; ++j){
                if(rating[j] < rating[i]){
                    if(j < i){
                        leftSmaller++;
                    }
                    else{
                        rightSmaller++;
                    }
                }
                else if(rating[j] > rating[i]){
                    if(j < i){
                        leftBigger++;
                    }
                    else{
                        rightBigger++;
                    }
                }
            }
            res += leftBigger * rightSmaller + leftSmaller * rightBigger;
        }
        return res;
    }
}