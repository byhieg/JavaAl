package interviewAL;

import org.omg.PortableInterceptor.INACTIVE;
import tools.FullPrint;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shiqifeng on 2017/3/26.
 * Mail byhieg@gmail.com
 */
public class Al236 {

    public static int getResult(int [] nums){
        int max = 1;
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0 ; i < nums.length;i++) {
            if (!maps.containsKey(nums[i])) {
                maps.put(nums[i], 1);
                if (maps.containsKey(nums[i] - 1)) {
                    max = Math.max(max, merge(maps, nums[i] - 1, nums[i]));
                }
                if (maps.containsKey(nums[i] + 1)) {
                    max = Math.max(max, merge(maps, nums[i], nums[i] + 1));
                }
            }
        }
        return max;
    }

    public static int merge(Map<Integer, Integer> map, int a, int b) {
        int left = a - map.get(a) + 1;
        int right = b + map.get(b) - 1;
        int len = right - left + 1;
        map.put(left, len);
        map.put(right, len);
        return len;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        FullPrint.printResult(getResult(nums));

    }
}
