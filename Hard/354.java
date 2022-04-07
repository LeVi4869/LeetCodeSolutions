import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][2];
        int[] arr1 = { 5, 4 };
        int[] arr2 = { 6, 4 };
        int[] arr3 = { 6, 7 };
        int[] arr4 = { 2, 3 };
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        arr[3] = arr4;
        maxEnvelopes(arr);
    }

    public static int maxEnvelopes(int[][] envelopes) {
        int[] dp = new int[envelopes.length];
        for (int i = 0; i < envelopes.length - 1; i++) {
            for (int j = i + 1; j < envelopes.length; j++) {
                if (envelopes[i][0] > envelopes[j][0]) {
                    int[] temp = Arrays.copyOf(envelopes[i], 2);
                    envelopes[i] = Arrays.copyOf(envelopes[j], 2);
                    envelopes[j] = Arrays.copyOf(temp, 2);
                }
            }
        }
        for (int i = 0; i < envelopes.length; i++) {
            int last = 0;
            for (int j = i; j >= 0; j--) {
                if (envelopes[i][1] > envelopes[j][1] && envelopes[i][0] > envelopes[j][0]) {
                    last = Math.max(last, dp[j] + 1);
                }
            }
            dp[i] = last;
        }
        int ans = 0;
        for (int i = 0; i < envelopes.length; i++) {
            System.out.print(dp[i]);
            System.out.print(" ");
            ans = Math.max(ans, dp[i]);
        }
        return ans + 1;
    }
}