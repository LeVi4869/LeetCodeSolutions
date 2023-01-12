class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int num: piles) {
            heap.add(num);
        }
        
        for (int i = 0; i < k; i++) {
            int curr = heap.remove();
            heap.add(curr - curr / 2);
        }
        
        int ans = 0;
        for (int num: heap) {
            ans += num;
        }
        
        return ans;
    }
}