package interviewAL;

import tools.FullPrint;

/**
 * Created by shiqifeng on 2017/4/4.
 * Mail byhieg@gmail.com
 */
public class Al325 {

    //不断循环每一位，判断是不是为1
    public static void count1(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        FullPrint.printResult(res);
    }

    //利用n & (n - 1)表示抹掉最右边的1
    public static void count2(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }

        FullPrint.printResult(res);
    }

    public static void main(String[] args) {
        count2(4);
    }
}
