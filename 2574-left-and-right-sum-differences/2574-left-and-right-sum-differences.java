class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        arr[0] = sum - nums[0];
        int left = nums[0];
        int right = 0;
        for (int i = 1; i < nums.length; i++) {
            right = sum - (nums[i] + left);
            arr[i] = Math.abs(right - left);
            left += nums[i];
        }
        return arr;
    }
}