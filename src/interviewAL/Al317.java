package interviewAL;

import tools.Convert;

/**
 * Created by shiqifeng on 2017/4/4.
 * Mail byhieg@gmail.com
 */
public class Al317 {

    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        Convert.decToBin(a);
        Convert.decToBin(b);
        a = a ^ b;
        Convert.decToBin(a);
        b = a ^ b;
        Convert.decToBin(b);
        a = a ^ b;
        Convert.decToBin(a);

        int c = 1;
        Convert.decToBin(~c);
    }
}
