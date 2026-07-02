class Solution {
    public int rob(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 1) return nums[0];
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        ans.add(nums[0]);
        ans.add(Math.max(nums[0], nums[1]));

        for(int i = 2;i<nums.length;i++){
            int curr_rob = nums[i] + ans.get(i-2);
            int skip = ans.get(i-1);
            ans.add(Math.max(curr_rob,skip));
        }
        return ans.get(ans.size() - 1);
    }
}