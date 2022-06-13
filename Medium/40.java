import java.util.*;
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>());
        return result;
    }
    public void backtrack(int[] candidates, int index, int target, List<Integer> list) {
        if(target == 0) {
            result.add(new ArrayList(list));
        }
        if(target < 0) {
            return;
        }
        for(int i = index; i < candidates.length; ++i) {
            if (i > index && candidates[i] == candidates[i-1]) continue;
            list.add(candidates[i]);
            backtrack(candidates, i + 1, target - candidates[i], list);
            list.remove(list.size() - 1);
        }
    }
}