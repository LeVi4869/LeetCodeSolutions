class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums){
            if(map.get(num) == 1 && !map.containsKey(num - 1) && !map.containsKey(num + 1)){
                res.add(num);
            }
        }
        return res;
    }
}