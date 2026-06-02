import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        ans.add(dq.isEmpty() ? 0 : nums[dq.peekFirst()]);
        for (int i = k; i < nums.length; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);

            ans.add(dq.isEmpty() ? 0 : nums[dq.peekFirst()]);
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
