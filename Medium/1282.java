class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; ++i){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>());
            }
            List<Integer> temp = map.get(groupSizes[i]);
            temp.add(i);
            if(temp.size() == groupSizes[i]){
                list.add(temp);
                map.remove(groupSizes[i]);
            }
        }
        return list;
    }
}