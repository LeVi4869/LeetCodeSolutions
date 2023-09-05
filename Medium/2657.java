class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int cnt = 0;
        int len = A.length;
        int res[] = new int[len];
        int check[] = new int[len + 1];
        for(int i = 0; i < len; ++i){
            check[A[i]]++;
            if(check[A[i]] == 2){
                cnt++;
            }
            check[B[i]]++;
            if(check[B[i]] == 2){
                cnt++;
            }
            res[i] = cnt;
        }
        return res;
    }
}