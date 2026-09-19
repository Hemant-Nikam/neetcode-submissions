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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null)
            return ans;
            
        queue.addLast(root);

        while(!queue.isEmpty())
        {
            int len = queue.size();
            List<Integer> row = new ArrayList<>();
            for(int i = 0 ; i < len ; i++)
            {
                TreeNode node = queue.removeFirst();

                if(node != null)
                {
                    row.add(node.val);
                }

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);

            }
            if(row.size() > 0)
                ans.add(row);

        }
        return ans;
    }
}
