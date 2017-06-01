package interviewAL;

import java.util.Scanner;

/**
 * Created by byhieg on 17/4/7.
 * Mail to byhieg@gmail.com
 */
public class JD1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String a = scanner.next();
            String b = scanner.next();
            String result = Integer.valueOf(a,2).toString();
            int t1 = Integer.valueOf(result);
            result = Integer.valueOf(b,2).toString();
            int t2 = Integer.valueOf(result);
            System.out.println(t1 ^ t2);
        }
    }
}
