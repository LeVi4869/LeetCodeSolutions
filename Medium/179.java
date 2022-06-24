class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length == 0)    {
            return "0";
        }
        String[] numbers = new String[nums.length];
		for(int i = 0; i < nums.length; i++)
		    numbers[i] = String.valueOf(nums[i]);
        Comparator<String> comp = new Comparator<String>(){
            public int compare(String str1, String str2){
		        String s1 = str1 + str2;
				String s2 = str2 + str1;
				return s2.compareTo(s1);
		    }
        };
        Arrays.sort(numbers, comp);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers.length; ++i) {
            sb.append(numbers[i]);
        }
        if(sb.toString().charAt(0) == '0')  {
            return "0";
        }
        return sb.toString();
    }
}