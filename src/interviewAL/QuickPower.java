package interviewAL;

import tools.FullPrint;

/**
 * Created by shiqifeng on 2017/3/20.
 * Mail byhieg@gmail.com
 */
public class QuickPower {
    public static long Power(long n, int x) {
        long result = 1;
        for (;x != 0; x >>= 1) {
            if ((x & 1) == 1) {
                result *= n;
            }
            n *= n;
        }

        return result;
    }

    public static void main(String[] args) {
        FullPrint.printResult(Power(10,15));
    }
}
