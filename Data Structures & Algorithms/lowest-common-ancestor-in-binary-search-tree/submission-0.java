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
    void path(TreeNode root, int val, List<Integer> list) {
    if (root == null)
        return;

    list.add(root.val);

    if (root.val == val)
        return;

    if (val < root.val)
        path(root.left, val, list);
    else
        path(root.right, val, list);
    }

    TreeNode findNode(TreeNode root, int val) {
        if (root.val == val)
            return root;

        if (val < root.val)
            return findNode(root.left, val);
        else
            return findNode(root.right, val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> plist = new ArrayList<>();
        List<Integer> qlist = new ArrayList<>();
        int ans = 0;
        path(root , p.val , plist);
        path(root , q.val , qlist);
        int pl = 0;
        int ql = 0;
        while(pl < plist.size() && ql < qlist.size())
        {
            System.out.println(plist.get(pl));
            System.out.println(qlist.get(pl));
            if(plist.get(pl++) == qlist.get(ql++) )
                ans = plist.get(pl -1);
        }
        
        return findNode(root, ans);      
    }
}
