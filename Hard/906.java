class Solution {
    public int superpalindromesInRange(String left, String right) {
        long leftLim = Long.valueOf(left);
        long rightLim = Long.valueOf(right);
        int res = 0;
        for (int i = 1; i < 100000; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            for (int j = sb.length() - 2; j >= 0; j--) {
                sb.append(sb.charAt(j));
            }
            long v = Long.valueOf(sb.toString());
            v = v * v;
            if (v > rightLim) {
                break;
            }
            if (v >= leftLim && isPalindrome(v)) {
                res++;
            }
        }
        for (int i = 1; i < 100000; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            for (int j = sb.length() - 1; j >= 0; j--) {
                sb.append(sb.charAt(j));
            }
            long v = Long.valueOf(sb.toString());
            v = v * v;
            if (v > rightLim) {
                break;
            }
            if (v >= leftLim && isPalindrome(v)) {
                res++;
            }
        }
        return res;
    }

    public boolean isPalindrome(long x) {
        return x == reverse(x);
    }

    public int countDigit(long x) {
        int count = 0;
        while (x > 0) {
            count++;
            x /= 10;
        }
        return count;
    }

    public long reverse(long x) {
        long ans = 0;
        while (x > 0) {
            ans = 10 * ans + x % 10;
            x /= 10;
        }

        return ans;
    }
}