class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       int sum =0;
       int left = 0;
       int Max_Sum = 0;
       for(int i = 0;i< nums.length;i++){
        while(set.contains(nums[i])){
          set.remove(nums[left]);
          sum = sum - nums[left];
          left++;
        }
        set.add(nums[i]);
        sum = sum + nums[i];
        Max_Sum = Math.max(sum,Max_Sum);
        
        }
        return Max_Sum; 
    }
}