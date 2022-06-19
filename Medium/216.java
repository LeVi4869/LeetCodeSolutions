class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum3(int k, int n) {
        res = new ArrayList<>();
        backtrack(new ArrayList<>(), 1, n, k);
        return res;
    }
    public void backtrack(List<Integer> comb, int min, int target, int count) {
        if(count == 0 && target == 0)  {
            List<Integer> temp = new ArrayList<>(comb);
            res.add(temp);
            return;
        }
        for(int i = min; i <= 9; ++i)  {
            comb.add(i);
            backtrack(comb, i + 1, target - i, count - 1);
            comb.remove(comb.size() - 1);
        }
    }
}