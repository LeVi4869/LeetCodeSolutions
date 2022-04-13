import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> newList = new ArrayList<>();
        List<List<Integer>> resList = new ArrayList<>();
        combineHelper(resList, newList, n, k, 1);
        return resList;
    }

    public void combineHelper(List<List<Integer>> resList, List<Integer> list, int n, int k, int min) {
        if (k == 0) {
            resList.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = min; i <= n; i++) {
                list.add(i);
                combineHelper(resList, list, n, k - 1, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}