class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        candies[0] = 1;
        for (int i = 1; i < ratings.length; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } else {
                candies[i] = 1;
            }
        }
        candies[ratings.length - 1] = Math.max(1, candies[ratings.length - 1]);
        for (int i = ratings.length - 2; i >= 0; --i) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            } else {
                candies[i] = Math.max(1, candies[i]);
            }
        }
        int count = 0;
        for (int i : candies) {
            count += i;
        }
        return count;
    }
}