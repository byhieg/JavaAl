package interviewAL;

import java.util.Scanner;

/**
 * Created by shiqifeng on 2017/3/23.
 * Mail byhieg@gmail.com
 */
public class Huawei02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0 ; i < chars.length;i++) {
            String targer = chars[i] + "";
            if (s.equals(targer) || s.equals(targer.toLowerCase()) || s.equals(targer.toUpperCase())) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
