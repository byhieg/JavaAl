package interviewAL;

import tools.FullPrint;

/**
 * Created by shiqifeng on 2017/4/4.
 * Mail byhieg@gmail.com
 */
public class Al328 {

    public static void printOddTimesNum1(int[] arr) {
        int cur = 0;
        for (int a : arr) {
            cur = cur ^ a;
        }
        FullPrint.printResult(cur);
    }

    //我们还是从头到尾依次异或数组中的每一个数字，
    // 那么最终得到的结果就是两个只出现一次的数字的异或结果。
    // 因为其他数字都出现了两次，在异或中全部抵消掉了。
    // 由于这两个数字肯定不一样，那么这个异或结果肯定不为0，也就是说在这个结果数字的二进制表示中至少就有一位为1。
    // 我们在结果数字中找到第一个为1的位的位置，记为第N位。
    // 现在我们以第N位是不是1为标准把原数组中的数字分成两个子数组，
    // 第一个子数组中每个数字的第N位都为1，而第二个子数组的每个数字的第N位都为0。
    public static void printOddTimesNum2(int[] arr) {
        int e0 = 0;
        for (int a : arr) {
            e0 = e0 ^ a;
        }

        //得到最右边为1的数
        int b = e0 & (~e0 + 1);
        int resA = 0;
        for (int a : arr) {
            //第N为为1的数
            if ((a & b) != 0) {
                resA = resA ^ a;
            }
        }

        FullPrint.printResult(resA);
        FullPrint.printResult(resA ^ e0);
    }

    public static void main(String[] args) {
        printOddTimesNum2(new int[]{1,1,1,1,2,2,2,2,3,4});
    }
}
