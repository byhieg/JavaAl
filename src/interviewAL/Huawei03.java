package interviewAL;

import java.util.*;

/**
 * Created by shiqifeng on 2017/3/23.
 * Mail byhieg@gmail.com
 */
public class Huawei03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Set<Integer> set = new TreeSet<>();

            int n = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0 ;i <n;i++) {
                num[i] = sc.nextInt();
                set.add(num[i]);
            }
            for (Integer i : set) {
                System.out.println(i);
            }
        }


    }
}
