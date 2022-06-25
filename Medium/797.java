class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> start = new ArrayList<>();
        start.add(0);
        backtrack(res, start, 0, graph);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> temp, int node, int[][] graph) {
        
        if(node == graph.length - 1)    {
            res.add(new ArrayList<>(temp));
        }
        for(int i = 0; i < graph[node].length; ++i) {
            temp.add(graph[node][i]);
            backtrack(res, temp, graph[node][i], graph);
            temp.remove(temp.size() - 1);
        }
    }
}