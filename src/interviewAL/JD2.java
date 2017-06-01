package interviewAL;

import java.util.Scanner;

/**
 * Created by byhieg on 17/4/7.
 * Mail to byhieg@gmail.com
 */
public class JD2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int a = n / k;
            int b = n % k;
            int res = a;
            while(b < (a - 1)){
                a = a - 1;
                res = a;
                b = b + k;
                if(b / (k + 1) >= (a - 2)){
                    res++;
                }
            }
            System.out.println(res);
        }
    }

//    public static int getResult(int n,int k){
//        int a = n / k;
//        int b = n % k;
//        int res = 0;
//        if(b < (a - 1)){
//            a = a - 1;
//
//        }
//    }
}
