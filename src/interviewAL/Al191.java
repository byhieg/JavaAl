package interviewAL;

import tools.FullPrint;

/**
 * Created by shiqifeng on 2017/3/21.
 * Mail byhieg@gmail.com
 */
public class Al191 {

    public static int minCoins1(int[] arr, int aim) {
        if (arr == null || aim < 0 || arr.length == 0) {
            return -1;
        }

        int n = arr.length;
        int[][] dp = new int[n][aim + 1];
        for (int j = 1 ; j <= aim ; j++) {
            dp[0][j] = Integer.MAX_VALUE;
            if (j - arr[0] >= 0 && dp[0][j - arr[0]] != Integer.MAX_VALUE) {
                dp[0][j] = dp[0][j - arr[0]] + 1;
            }
        }
        int left = 0;
        for (int i = 1 ; i < n;i++) {
            for (int j = 1; j <= aim;j++) {
                left = Integer.MAX_VALUE;
                if (j - arr[i] >= 0 && dp[i][j - arr[i]] != Integer.MAX_VALUE) {
                    left = dp[i][j - arr[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i - 1][j]);
            }
        }

        return dp[n - 1][aim] != Integer.MAX_VALUE ? dp[n - 1][aim] : -1;
    }

    public static int minCoins2(int[] arr, int aim) {
        if (arr == null || aim < 0 || arr.length == 0) {
            return -1;
        }
        int n = arr.length;
        int[] dp = new int[aim + 1];
        int left = 0;
        for (int i = 1; i <= aim;i++) {
            dp[i] = Integer.MAX_VALUE;
            if (i - arr[0] >= 0 && dp[i - arr[0]] != Integer.MAX_VALUE) {
                dp[i] = dp[i - arr[0]] + 1;
            }
        }

        for (int i = 1; i < n;i++) {
            for (int j = 1; j<= aim;j++) {
                left = Integer.MAX_VALUE;
                if (j - arr[i] >= 0 && dp[j - arr[i]] != Integer.MAX_VALUE) {
                    left = dp[j - arr[i]] + 1;
                }
                dp[j] = Math.min(left, dp[j]);
            }
        }

        return dp[aim] != Integer.MAX_VALUE ? dp[aim] : -1;

    }



    public static void main(String[] args) {
        int[] arr = {5, 2, 3};
        FullPrint.printResult(minCoins2(arr,20));
    }
}

