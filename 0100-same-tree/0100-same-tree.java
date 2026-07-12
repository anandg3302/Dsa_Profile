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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(p);
        qu.offer(q);

        while (!qu.isEmpty()) {
            TreeNode n1 = qu.poll();
            TreeNode n2 = qu.poll();

            if (n1 == null && n2 == null)
                continue;

            if (n1 == null || n2 == null)
                return false;

            if (n1.val != n2.val)
                return false;

            qu.offer(n1.left);
            qu.offer(n2.left);
            qu.offer(n1.right);
            qu.offer(n2.right);
        }

        return true;
    }
}