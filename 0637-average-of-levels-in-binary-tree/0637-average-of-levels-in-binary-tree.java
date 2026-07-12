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
    List<Double> ans = new ArrayList<>();
    Queue<TreeNode> qu = new LinkedList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) return ans;
      qu.offer(root);
      while(!qu.isEmpty()){
        int levelSize = qu.size();
         double sum= 0;
        for(int i = 0;i < levelSize;i++){ 
            TreeNode left = qu.poll();
            sum += left.val;
             if(left.left != null){
                qu.offer(left.left);
             }
             if(left.right != null){
                qu.offer(left.right);
             }
              
        }
        ans.add((double)sum  / levelSize);
      }
      return ans;
    }
}