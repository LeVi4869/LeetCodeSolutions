class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result = new ArrayList<>();
        List<int[]> height = new ArrayList<>();
        for (int[] b : buildings) {
            // start point has negative height value
            height.add(new int[] { b[0], -b[2] });
            // end point has normal height value
            height.add(new int[] { b[1], b[2] });
        }

        // sort $height, based on the first value, if necessary, use the second to
        // break ties
        Collections.sort(height, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });

        // Use a maxHeap to store possible heights
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

        // Provide a initial value to make it more consistent
        pq.offer(0);

        // Before starting, the previous max height is 0;
        int prev = 0;

        // visit all points in order
        for (int[] h : height) {
            if (h[1] < 0) { // a start point, add height
                pq.offer(-h[1]);
            } else { // a end point, remove height
                pq.remove(h[1]);
            }
            int cur = pq.peek(); // current max height;

            // compare current max height with previous max height, update result and
            // previous max height if necessary
            if (prev != cur) {
                List<Integer> list = new ArrayList<>();
                list.add(h[0]);
                list.add(cur);
                result.add(list);
                prev = cur;
            }
        }
        return result;
    }
}