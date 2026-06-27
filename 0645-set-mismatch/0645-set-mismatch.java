import java.util.HashMap;

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // Directly create the output array of size 2
        int[] result = new int[2];
        int n = nums.length;
        
        for (int i = 1; i <= n; i++) {
            // If the number is missing from the map, it's the missing number
            if (!map.containsKey(i)) {
                result[1] = i; // Missing goes to index 1
            }
            // If the number appears more than once, it's the duplicate
            else if (map.get(i) > 1) {
                result[0] = i; // Duplicate goes to index 0
            }
        }
        
        return result;
    }
}
