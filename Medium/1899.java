class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] res = new int[3];
        for(int[] triplet : triplets)   {
            if(triplet[0] <= target[0] && triplet[1] <= target[1] && triplet[2] <= target[2])   {
                res[0] = Math.max(triplet[0], res[0]);
                res[1] = Math.max(triplet[1], res[1]);
                res[2] = Math.max(triplet[2], res[2]);
            }
        }
        return res[0] == target[0] && res[1] == target[1] && res[2] == target[2];
    }
}