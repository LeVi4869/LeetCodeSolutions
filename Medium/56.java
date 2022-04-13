class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> mergeList = new LinkedList<>();
        for (int[] i : intervals) {
            if (mergeList.isEmpty() || mergeList.getLast()[1] < i[0]) {
                mergeList.add(i);
            } else
                mergeList.getLast()[1] = Math.max(mergeList.getLast()[1], i[1]);
        }
        return mergeList.toArray(new int[mergeList.size()][]);
    }
}