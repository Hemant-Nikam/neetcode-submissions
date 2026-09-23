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
    int[] preOrder ;
    int[] inOrder ;
    
    int index(int[] arr , int target)
    {
        int i = 0;
        for(i = 0 ; i < arr.length ; i++)
            if(arr[i] == target)
                break;
        return i;
    }

    TreeNode build( int ps , int pe , int is , int ie)
    {
        if(ps >= pe || is >= ie)
            return null ;

        TreeNode root = new TreeNode(preOrder[ps]);

        int mid = index(inOrder , preOrder[ps]);

        root.left = build( ps + 1 , ps + 1 + mid - is , is , mid);

        root.right = build( ps + 1 + mid - is  , pe , mid + 1 , ie);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preOrder = preorder;
        this.inOrder = inorder;

        if(inorder.length == 0 || preorder.length == 0)
            return null;
        
        return build( 0 , preorder.length  , 0 , inorder.length );
    }
}
