class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[][] arr = new int[nums.length][2];
        for(int i = 0 ;i < nums.length;i++){
            arr[i][0] = nums[i];
            arr[i][1] = map.get(nums[i]);
        }
      Arrays.sort(arr,(a,b) -> {
        if(a[1] == b[1]){
            return Integer.compare(b[0],a[0]);
        }
        return Integer.compare(a[1],b[1]);
      });
      for(int i = 0;i < nums.length; i++){
        nums[i] = arr[i][0];
      }
      return nums;
    }
}