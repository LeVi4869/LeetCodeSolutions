class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int last = 0;
        for(char c : bank[0].toCharArray()){
            if(c == '1'){
                ++last;
            }
        }
        for(int i = 1; i < bank.length; ++i){
            int temp = 0;
            for(char c : bank[i].toCharArray()){
                if(c == '1'){
                    ++temp;
                }
            }
            if(temp > 0){
                res += last * temp;
                last = temp;
            }
        }
        return res;
    }
}