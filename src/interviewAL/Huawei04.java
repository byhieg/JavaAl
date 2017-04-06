package interviewAL;

import java.util.Scanner;

/**
 * Created by shiqifeng on 2017/3/23.
 * Mail byhieg@gmail.com
 */
public class Huawei04 {

    static int count1 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String s2 = sc.nextLine();

            if (str != " ") {
                String[] result1 = getResult(str);
                int a = count1;
                for (int i = 0 ;i <a;i++) {
                    if (result1.equals("00000000")){
                        System.out.println();
                    }else{
                        System.out.println(result1[i]);
                    }
                }
            }else{
                System.out.println();
            }
            if (!s2.isEmpty()) {
                String[] result2 = getResult(s2);
                int b = count1;
                for (int i = 0 ; i < b;i++) {
                    if (result2.equals("00000000")){
                        System.out.println();
                    }else{
                        System.out.println(result2[i]);
                    }
                }
            }else {
                System.out.println();
            }

        }
    }

    public static String getLengthNotEnougth8(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length(); i < 8; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    public static String[] getResult(String str) {
        String[] strs = new String[100];
        int count = 0;
        if (str.length() <= 8 && str.length() >0) {
            strs[count++] = getLengthNotEnougth8(str);
        }else{
            char[] chars = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < chars.length;i++) {
                sb.append(chars[i]);
                if ((i + 1) % 8  == 0) {
                    strs[count++] = sb.toString();
                    sb = new StringBuilder();
                }
            }
            strs[count++] = getLengthNotEnougth8(sb.toString());
        }
        count1 = count;
        return strs;
    }
}
