public class Solution {

	    public int[] twoSum(int[] nums, int target) {

	        Map<Integer, Integer> h = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {

	            h.put(nums[i], i);

	        }
	        for (int i = 0; i < nums.length; i++) {

	            int y = target - nums[i];

	            if (h.containsKey(y) && h.get(y) != i) {

	                return new int[] {i+1, h.get(y)+1};

	            }

	        }
              throw new IllegalArgumentException("No two sum solution");
        }

	}