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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int low = 0 ;
        int high = 0 ;
        if(p.val > q.val)
        {
            high = p.val ;
            low = q.val ; 
        }
        else
        {
            high = q.val ;
            low = p.val ; 

        }
        while(true)
        {
            if((root.val >= low && root.val <= high))
                break;

            if(root.val < low && root.val < high)
            {
                root = root.right;
            }
            else if(root.val > low && root.val > high)
            {
                root = root.left;
            }
            
        }
        return root;
    }
}
