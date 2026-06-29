import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        
        // Initialize the array with numbers 1 through 9
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        backtrack(0, n, k, arr, current, ans);
        return ans;
    }

    private void backtrack(int idx, int target, int k, int[] arr, List<Integer> current, List<List<Integer>> ans) {
        // Base Case 1: Winner!
        if (current.size() == k && target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        
        // Base Case 2: Stop early if we went too far
        if (target < 0 || current.size() > k) {
            return;
        }

        // Loop through the numbers starting from the current index
        for (int i = idx; i < arr.length; i++) {
            current.add(arr[i]);
            backtrack(i + 1, target - arr[i], k, arr, current, ans);
            current.remove(current.size() - 1);
        }
    }
}
