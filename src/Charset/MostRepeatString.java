package Charset;

/**
 * Created by byhieg on 17/4/14.
 * Mail to byhieg@gmail.com
 */

import org.jetbrains.annotations.NotNull;
import tools.FullPrint;

import java.util.Arrays;

/**
 * 输出给定字符串中最长重复子串
 */
public class MostRepeatString {

    @NotNull
    public static String getMostRepeatString(String str) {
        String[] suffix = getSuffix(str);
        int max = 0;
        int res = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (getMostLength(suffix[i], suffix[i + 1]) > max) {
                max = getMostLength(suffix[i], suffix[i + 1]);
                res = i;
            }
        }
        return suffix[res].substring(0,max);
    }

    public static String[] getSuffix(String str) {
        String[] suffix = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            suffix[i] = str.substring(i, str.length());
        }
        Arrays.sort(suffix);
        return suffix;
    }

    public static int getMostLength(String a, String b) {
        int max = 0;
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        int cur = 0;
        for (int i = 0 ; i < ca.length;i++) {
            if (cur < cb.length) {
                if (ca[i] == cb[cur++]) {
                    max++;
                }
            } else{
                break;
            }


        }
        return max;
    }

    public static void main(String[] args) {
        FullPrint.printResult(getMostRepeatString("abcdhjklohjkloabcd"));
    }
}
