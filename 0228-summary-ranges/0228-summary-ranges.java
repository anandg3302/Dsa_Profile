class Solution {
    public List<String> summaryRanges(int[] nums) {

        ArrayList<String> ans = new ArrayList<>();

        int i = 0;
        int n = nums.length;
        int start = 0;

        while (i < n - 1) {

            if (nums[i] + 1 == nums[i + 1]) {
                i++;
            } 
            else {
                if (start == i) {
                    ans.add(String.valueOf(nums[start]));
                } else {
                    ans.add(nums[start] + "->" + nums[i]);
                }

                i++;
                start = i;
            }
        }
        if (n > 0) {
            if (start == n - 1) {
                ans.add(String.valueOf(nums[start]));
            } else {
                ans.add(nums[start] + "->" + nums[n - 1]);
            }
        }

        return ans;
    }
}