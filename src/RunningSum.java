import java.util.Arrays;
//https://leetcode.com/problems/running-sum-of-1d-array/

/**
 * Problem number: 28
 * Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *
 * Author: Khamis Buol
 * Year:   2023
 *
 */

public class RunningSum {

    RunningSum() {

    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        RunningSum runningSum = new RunningSum();

        int[] runningSums = runningSum.runningSum(nums);
        System.out.println(Arrays.toString(runningSums));

    }

    /**
     *
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
