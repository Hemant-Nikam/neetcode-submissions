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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();

        if(root == null)
            return ans;
        
        queue.addLast(root);

        while(!queue.isEmpty())
        {
            int len = queue.size();
            List<Integer> temp = new ArrayList<>();

            for(int i = 0 ; i < len ; i++)
            {
                TreeNode node = queue.removeFirst();
                if(node != null)
                {
                    temp.add(node.val);
                }
                if(node.left != null)
                    queue.addLast(node.left);
                if(node.right != null)
                    queue.addLast(node.right);

            }
            ans.add(temp.get(temp.size() - 1));
        }
        return ans;
    }
}
