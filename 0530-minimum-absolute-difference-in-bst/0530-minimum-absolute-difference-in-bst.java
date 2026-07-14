/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public int getMinimumDifference(TreeNode root) {
//         if (root == null)
//             return 0;

//         Queue<TreeNode> qu = new LinkedList<>();
//         List<Integer> list = new ArrayList<>();

//         qu.offer(root);

//         while (!qu.isEmpty()) {
//             TreeNode curr = qu.poll();

//             list.add(curr.val);

//             if (curr.left != null)
//                 qu.offer(curr.left);

//             if (curr.right != null)
//                 qu.offer(curr.right);
//         }

//         Collections.sort(list);

//         int ans = Integer.MAX_VALUE;

//         for (int i = 1; i < list.size(); i++) {
//             ans = Math.min(ans, list.get(i) - list.get(i - 1));
//         }

//         return ans;
//     }
// }


class Solution {
    public int getMinimumDifference(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        Integer prev = null;
        int minDiff = Integer.MAX_VALUE;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            if (prev != null) {
                minDiff = Math.min(minDiff, curr.val - prev);
            }

            prev = curr.val;

            curr = curr.right;
        }

        return minDiff;
    }
}