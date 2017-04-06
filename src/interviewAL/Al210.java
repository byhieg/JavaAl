package interviewAL;

import java.util.Scanner;

/**
 * Created by shiqifeng on 2017/3/23.
 * Mail byhieg@gmail.com
 */
public class Al210 {

    public static int[][] getDp(char[] str1,char[] str2){
        int n = str1.length,m = str2.length;
        int[][] dp = new int[str1.length][str2.length];
        dp[0][0] = str1[0] == str2[0] ? 1 : 0;
        for (int i = 1 ; i < n;i++) {
            dp[i][0] = Math.max(dp[i - 1][0], str1[i] == str2[0] ? 1 : 0);
        }
        for (int j = 1;j <m;j++) {
            dp[0][j] = Math.max(dp[0][j - 1], str1[0] == str2[j] ? 1 : 0);
        }
        for (int i = 1 ; i < n;i++) {
            for (int j = 1; j <m;j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (str1[i] == str2[j]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }
        return dp;
    }

    public static String getStr(char[] str1, char[] str2) {
        String result = "";
        int n = str1.length - 1, m = str2.length - 1;
        int[][] dp = getDp(str1, str2);
        int index = dp[n][m] - 1;
        while (index >= 0) {
            if (n > 0 && dp[n - 1][m] == dp[n][m]) {
                n--;
            } else if (m > 0 && dp[n][m - 1] == dp[n][m]) {
                m--;
            }else {
                result += str1[n];
                m--;
                n--;
                index--;
            }
        }

       return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            int n = sc.nextInt();
            String str2 = sc.next();
            int m = sc.nextInt();
            System.out.println(getDp(str1.toCharArray(), str2.toCharArray())[n - 1][m - 1]);
            System.out.println(getStr(str1.toCharArray(), str2.toCharArray()));
        }
    }


}
