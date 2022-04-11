class Solution {
    List<String> list;

    public Solution() {
        list = new ArrayList<String>();
    }

    public List<String> generateParenthesis(int n) {
        helper("", n, n);
        return list;
    }

    public void helper(String s, int L, int R) {
        if (L == 0 && R == 0) {
            list.add(s);
            return;
        }
        if (L > 0) {
            helper(s + "(", L - 1, R);
        }
        if (R > L) {
            helper(s + ")", L, R - 1);
        }
    }
}