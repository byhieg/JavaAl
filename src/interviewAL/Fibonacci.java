package interviewAL;

import tools.Convert;
import tools.FullPrint;

import java.util.InputMismatchException;
import java.util.Vector;
import java.util.regex.Matcher;

/**
 * Created by shiqifeng on 2017/3/20.
 * Mail byhieg@gmail.com
 *
 */
public class Fibonacci {

    public static int f1(int n) {
        if (n == 1 || n == 0 || n == 2) {
            return 1;
        }

        return f1(n - 1) + f1(n - 2);
    }

    public static int f2(int n) {
        if (n == 1 || n <= 0) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        int prev = 1;
        int next = 1;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = prev + next;
            prev = next;
            next = result;

        }
        return result;
    }

    public static int f3(int n){
        if (n == 1 || n == 0) {
            return 1;
        }

        int[][] base = {{1, 1}, {1, 0}};
        int[][] res = matrixPower(base, n - 2);
        return res[0][0] + res[1][0];
    }

    public static int[][] matrixPower(int[][] m, int p) {
        int[][] res = new int[m.length][m[0].length];
        for (int i = 0 ; i < res.length;i++) {
            res[i][i] = 1;
        }

        int [][] tmp = m;
        for (; p != 0; p >>= 1) {
            if ((p & 1) == 1) {
                res = multiMatrix(res, tmp);
            }
            tmp = multiMatrix(tmp, tmp);
        }
        return res;
    }

    private static int[][] multiMatrix(int[][] m1, int[][] m2) {
        int[][] res = new int[m1.length][m2[0].length];
        for (int i = 0 ; i < m1.length;i++) {
            for (int j = 0 ; j < m2[0].length;j++) {
                for (int k = 0 ;k < m2.length;k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        FullPrint.printResult(f3(40));

    }
}
