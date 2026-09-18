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
    boolean isSame(TreeNode root, TreeNode p)
    {
        if(root == null && p == null)
            return true;
        if(root == null && p != null || root != null && p == null)
            return false;
        return (root.val == p.val) && isSame(root.left , p.left) && isSame(root.right , p.right);
    }
    boolean isSub(TreeNode root, TreeNode subRoot)
    {
        if(root == null)
            return false;
        if(root.val == subRoot.val)
            if(isSame(root,subRoot))
                return true;
        return isSub(root.left,subRoot) || isSub(root.right,subRoot);
        

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return isSub(root , subRoot);
    }
}
