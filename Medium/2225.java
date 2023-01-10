class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] count = new int[100001];
        Arrays.fill(count, -1);
        for(int[] match : matches){
            if(count[match[0]] == -1){
                count[match[0]] = 0;
            }
            if(count[match[1]] == -1){
                count[match[1]] = 0;
            }
            ++count[match[1]];
        }
        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for(int i = 0; i < count.length; ++i){
            if(count[i] == 0){
                zeroLoss.add(i);
            }
            else if(count[i] == 1){
                oneLoss.add(i);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(zeroLoss);
        res.add(oneLoss);
        return res;
    }
}