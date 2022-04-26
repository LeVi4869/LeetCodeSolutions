class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int k : tasks)
            count.put(k, count.getOrDefault(k, 0) + 1);
        int res = 0;
        for (int cnt : count.values()) {
            if (cnt == 1) return -1;
            res += (cnt + 2) / 3;
        }
        return res;
    }
}