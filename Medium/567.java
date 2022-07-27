class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        String comp = sortString(s1);
        for(int i = 0; i + len <= s2.length(); ++i)  {
            String temp = s2.substring(i, i + len);
            if(sortString(temp).equals(comp)) {
                return true;
            }
        }
        return false;
    }
    private static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
}