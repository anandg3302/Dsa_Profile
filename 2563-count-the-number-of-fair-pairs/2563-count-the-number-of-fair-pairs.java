import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairsLessThanOrEqualTo(nums, upper) - countPairsLessThanOrEqualTo(nums, lower - 1);
    }

    private long countPairsLessThanOrEqualTo(int[] nums, int target) {
        long count = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum <= target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
