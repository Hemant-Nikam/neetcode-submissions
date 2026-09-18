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
    boolean ans = true;
    int bal(TreeNode root)
    {
        if(root == null)
            return 0;
        int left = bal(root.left);
        int right = bal(root.right);
        int height = Math.max(left,right) + 1;
        if(Math.abs(left - right) > 1)
            ans = false;
        return height;
    }
    public boolean isBalanced(TreeNode root) {
        bal(root);
        return ans;
    }
}
