package leetcode;

import tools.FullPrint;
/**
 * Created by shiqifeng on 2017/3/26.
 * Mail byhieg@gmail.com
 */
public class FindComplement {

    public static int findComplement(int num) {
        FullPrint.printResult(~num);
        String str = Integer.toBinaryString(num);
        char[] chars = str.toCharArray();
        String result = "";
        for(int i = 0 ; i < chars.length;i++){
            result = result + (Integer.valueOf(chars[i] + "") == 1 ? 0:1);
        }
        return Integer.valueOf(result,2);
    }

    public static void main(String[] args) {
        FullPrint.printResult(findComplement(5));
    }
}
