package interviewAL;

import tools.FullPrint;

/**
 * Created by shiqifeng on 2017/3/26.
 * Mail byhieg@gmail.com
 */
public class Al213 {

    public static int[][] getDP(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (c1[i] == c2[0]) {
                dp[i][0] = 1;
            }
        }
        for (int j = 0; j < m; j++) {
            if (c1[0] == c2[j]) {
                dp[0][j] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (c1[i] == c2[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        String str1 = "1AB2345CD",str2 = "12345EF";
        int end = 0;
        int[][] dp = getDP(str1, str2);
        int max = dp[0][0];
        for (int i = 0 ; i < dp.length;i++) {
            for (int j = 0 ; j <dp[i].length;j++) {
                if (max < dp[i][j]) {
                    max = dp[i][j];
                    end = i;
                }
            }
        }

        FullPrint.printResult(str1.substring(end - max + 1,end +1));
    }
}
