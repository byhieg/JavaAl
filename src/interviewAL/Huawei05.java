package interviewAL;

import java.util.Scanner;

/**
 * Created by shiqifeng on 2017/3/23.
 * Mail byhieg@gmail.com
 */
public class Huawei05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next().substring(2);
            int s = Integer.valueOf(str, 16);
            System.out.println(s);
        }
    }
}
