import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        if (n < 1) {
            return false;
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i < n; i++) {
            if (counts.getOrDefault(i, 0) != 1) {
                return false;
            }
        }

        return counts.getOrDefault(n, 0) == 2;
    }
}
