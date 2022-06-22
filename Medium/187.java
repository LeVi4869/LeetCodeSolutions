class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet(), res = new HashSet();
        for(int i = 0; i < s.length() - 9; ++i) {
            String temp = s.substring(i, i + 10);
            if (!seen.add(temp))    {
                res.add(temp);
            }
        }
        return new ArrayList<>(res);
    }
}