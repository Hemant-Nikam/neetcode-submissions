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
    int max = 0;
    int dep(TreeNode root)
    {
        if(root == null)
            return 0;
        
        return Math.max(dep(root.left) , dep(root.right) ) + 1;
    }
    int inorder(TreeNode root)
    {
        int depth = 0;
        if(root != null)
        {
            inorder(root.left);
            depth = dep(root.left) + dep(root.right);
            max = Math.max(max,depth);
            inorder(root.right);
        }
        return depth;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        inorder(root);
        return max;
    }
}
