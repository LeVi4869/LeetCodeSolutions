class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> l = new LinkedList<>();  // Interface is LinkedList other than list
        for (int i = 1; i <= m; i++) l.add(i);
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int idx = l.indexOf(queries[i]);
            l.remove(idx);
            l.addFirst(queries[i]);
            res[i] = idx;
        }
        return res;
    }
}