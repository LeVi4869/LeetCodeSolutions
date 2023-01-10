class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : cpdomains){
            String[] tokens = s.split(" ");
            int cnt = Integer.parseInt(tokens[0]);
            String addr = tokens[1];
            int pos;
            while(true){
                map.put(addr, map.getOrDefault(addr, 0) + cnt);
                pos = addr.indexOf(".");
                if(pos == -1){
                    break;
                }
                else{
                    addr = addr.substring(pos + 1);
                }
            }
        }
        map.forEach((k,v) -> res.add(Integer.toString(v) + " " + k));
        return res;
    }
}