import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        backtrack(0, nums, current, ans);
        return ans;
    }

    public void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        List<Integer> copy = new ArrayList<>();
        for (int i = 0; i < current.size(); i++) {
            copy.add(current.get(i));
        }
        ans.add(copy);
        
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            backtrack(i + 1, nums, current, ans);
            current.remove(current.size() - 1);
        }
    }
}
