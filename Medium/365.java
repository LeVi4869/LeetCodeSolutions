class Solution {
    public boolean canMeasureWater(int cap1, int cap2, int target) {
        if(cap1 + cap2 < target)    {
            return false;
        }
        int temp = GCD(cap1, cap2);
        return target%temp == 0;
    }
    public int GCD(int a, int b){
        while(b != 0 ){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}