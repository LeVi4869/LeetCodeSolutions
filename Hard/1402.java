class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum = 0;
        int interval = 0;
        for (int i = satisfaction.length - 1; i >= 0; --i) {
            if (satisfaction[i] >= 0) {
                interval += satisfaction[i];
                sum += interval;
            } else {
                interval += satisfaction[i];
                if (interval > 0) {
                    sum += interval;
                } else {
                    break;
                }
            }
        }
        return sum;
    }
}