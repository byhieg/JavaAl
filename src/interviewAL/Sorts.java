package interviewAL;

import tools.FullPrint;

/**
 * Created by shiqifeng on 2017/3/27.
 * Mail byhieg@gmail.com
 */
public class Sorts {

    public static int[] chooseSort(int[] nums) {
        for (int i = 0 ; i < nums.length;i++) {
            int min = i;
            for (int j = i + 1 ; j < nums.length;j++) {
                if(nums[min] > nums[j]) {
                    min = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;
        }

        return nums;
    }

    public static int[] insertSort(int [] nums){
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, 5, 2, 78, 12, 532, 6, 22, 45};
        FullPrint.printArrays(chooseSort(nums));
    }
}
