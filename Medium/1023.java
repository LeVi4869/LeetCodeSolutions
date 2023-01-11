class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for(String s : queries){
            int pos = 0;
            boolean check = true;
            for(char c : s.toCharArray()){
                if(pos != pattern.length() && c == pattern.charAt(pos)){
                    ++pos;
                }
                else if(c >= 65 && c <= 90){
                    check = false;
                    break;
                }
            }
            if(pos != pattern.length()){
                check = false;
            }
            res.add(check);
        }
        return res;
    }
}