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
    public int minDepth(TreeNode root) {
         int left = 0;
         int right = 0;
        if(root == null) return 0;
        if(root.left != null){
          left = minDepth(root.left);
        }
        if(root.right != null){
          right = minDepth(root.right);
        }
        if(root.left == null) return 1 + right;
        if(root.right == null) return 1 + left;
        return 1+Math.min(left,right);
    }
}