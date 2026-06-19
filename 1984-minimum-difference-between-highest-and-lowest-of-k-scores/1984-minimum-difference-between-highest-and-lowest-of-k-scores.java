class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        int max_diff = Integer.MAX_VALUE;
        for(int i = 0; i <= nums.length-k;i++){
            int curr_diff = nums[i+k-1] - nums[i];
            if(curr_diff < max_diff){
                max_diff = curr_diff;
            }
        }
        return max_diff;
    }
}