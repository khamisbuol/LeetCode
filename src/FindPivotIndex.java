import java.util.Arrays;

public class FindPivotIndex {

    FindPivotIndex() {}

    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] nums1 = {2,3,-1,8,4};
        int[] nums2 = {1,-1,4};
        int[] nums3 = {2,5};
        int[] nums4 = {1,2,3};
        int[] nums5 = {2,1,-1};

        System.out.println(findPivotIndex.pivotIndex(nums1));
        System.out.println(findPivotIndex.pivotIndex(nums2));
        System.out.println(findPivotIndex.pivotIndex(nums3));
        System.out.println(findPivotIndex.pivotIndex(nums4));
        System.out.println(findPivotIndex.pivotIndex(nums5));

    }

    /**
     * This function returns the pivot index of an array of integers.
     * Example:
     *      Input: nums = [1,7,3,6,5,6]
     *      Output: 3
     *      Explanation:
     *      The pivot index is 3.
     *      Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
     *      Right sum = nums[4] + nums[5] = 5 + 6 = 11
     *
     *
     * @param nums array of numbers.
     * @return pivot index
     */
    public int pivotIndex(int[] nums) {
        System.out.printf("nums: %s\n", Arrays.toString(nums));
        int totalSum = 0, leftSum = 0;
        for (int num : nums) totalSum += num;
        for (int i=0; i<nums.length; leftSum += nums[i++]) {
            if (leftSum * 2 == totalSum - nums[i]) return i;
        }
        return -1;
    }
}
