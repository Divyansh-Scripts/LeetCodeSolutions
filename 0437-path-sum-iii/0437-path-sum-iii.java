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
    int helper (TreeNode root , long sum){
        if(root==null) return 0;
        int count = 0;
        if(root.val==sum) count++;
        count += helper(root.left,sum-root.val)+helper(root.right,sum-root.val);
        return count;
    }
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return helper(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
}