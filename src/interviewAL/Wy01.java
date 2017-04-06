package interviewAL;

import java.util.*;

/**
 * Created by shiqifeng on 2017/3/26.
 * Mail byhieg@gmail.com
 */
public class Wy01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0 ; i < n;i++) {
                nums[i] = sc.nextInt();
            }
            List<Integer> lists = new LinkedList<>();
            for (int i = 0 ; i < n;i++) {
                if (lists.contains(nums[i])) {
                    lists.remove(lists.indexOf(nums[i]));
                }
                lists.add(nums[i]);
            }

            for (int i = 0 ; i < lists.size();i++) {
                System.out.print(lists.get(i));
                if (i != lists.size() - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
