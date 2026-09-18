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
    boolean postOrder(TreeNode p , TreeNode q)
    {
        if(p == null && q == null)
            return true;
        if(p != null && q == null || q != null && p == null)
            return false;       
        return (p.val == q.val) && postOrder(p.left , q.left) && postOrder(p.right , q.right);
        

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return postOrder(p,q);
    }
}
