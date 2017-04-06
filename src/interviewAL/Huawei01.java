package interviewAL;

import java.util.Scanner;

/**
 * Created by shiqifeng on 2017/3/23.
 * Mail byhieg@gmail.com
 */
public class Huawei01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        System.out.println(strs[strs.length - 1].length());

    }
}
