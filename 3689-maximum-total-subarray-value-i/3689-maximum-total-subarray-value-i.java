class Solution {
    public long maxTotalValue(int[] nums, int k) {

        long best = 0;
        int mx = nums[0];
        int mn = nums[0];
        for(int i = 1; i < nums.length; i++) {
            mx = Math.max(mx,nums[i]);
            mn = Math.min(mn,nums[i]);
        }
        best = mx-mn;
        return best * k;
    }
}