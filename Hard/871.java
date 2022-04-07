class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int reached = startFuel;
        int ans = 0;
        for (int[] station : stations) {
            if (reached >= station[0]) {
                pq.offer(station[1]);
            } else {
                while (!pq.isEmpty() && reached < station[0]) {
                    reached += pq.poll();
                    ans++;
                }
                if (reached < station[0]) {
                    return -1;
                } else {
                    pq.offer(station[1]);
                }
            }
        }
        while (!pq.isEmpty() && reached < target) {
            reached += pq.poll();
            ans++;
        }
        if (reached < target) {
            return -1;
        }
        return ans;
    }
}