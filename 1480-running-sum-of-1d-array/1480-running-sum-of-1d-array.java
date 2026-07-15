class Solution {
    public int[] runningSum(int[] nums) {
       List<Integer> ans = new ArrayList<>();
       int sum = 0;
       for(int num : nums){
        sum += num;
        ans.add(sum);
       } 
       int[] arr = new int[ans.size()];
       for(int i = 0; i < nums.length;i++){
        arr[i] = ans.get(i);
       }
       return arr;
    }
}