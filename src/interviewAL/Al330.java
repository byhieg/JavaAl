package interviewAL;

import tools.FullPrint;

/**
 * Created by shiqifeng on 2017/4/4.
 * Mail byhieg@gmail.com
 */
public class Al330 {

    public static int[] getKSysNumFromNum(int value, int k) {
        int[] res = new int[32];
        int index = 0;
        while (value != 0) {
            res[index++] = value % k;
            value = value / k;
        }
        return res;
    }

    public static void setExclusiveOr(int[] e0, int value, int k) {
        int[] cur = getKSysNumFromNum(value, k);
        for (int i = 0 ; i < e0.length;i++) {
            e0[i] = (e0[i] + cur[i]) % k;
        }
    }

    public static void onceNum(int[] arr, int k) {
        int[] e0 = new int[32];
        for (int i = 0 ; i != arr.length;i++) {
            setExclusiveOr(e0,arr[i],k);
        }
        int res = getNumFromSysNum(e0, k);
        FullPrint.printResult(res);
    }

    public static int getNumFromSysNum(int[] e0, int k) {
        int res = 0;
        for (int i = e0.length - 1 ; i >= 0;i--) {
            res = res * k + e0[i];
        }

        return res;
    }

    public static void main(String[] args) {
        onceNum(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4}, 4);
    }
}
