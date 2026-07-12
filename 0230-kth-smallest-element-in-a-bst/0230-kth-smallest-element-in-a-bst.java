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
import java.util.*;

class Solution {

    public int kthSmallest(TreeNode root, int k) {

        PriorityQueue<TreeNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        traverse(root, pq);

        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        return pq.poll().val;
    }

    private void traverse(TreeNode root, PriorityQueue<TreeNode> pq) {
        if (root == null)
            return;

        pq.offer(root);

        traverse(root.left, pq);
        traverse(root.right, pq);
    }
}