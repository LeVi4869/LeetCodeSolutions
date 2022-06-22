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
        List<Integer> res = new ArrayList<>();
        if(root == null)    {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 1; i <= len; ++i)    {
                TreeNode temp = queue.poll();
                if(temp.left != null)   {
                    queue.add(temp.left);
                }
                if(temp.right != null)   {
                    queue.add(temp.right);
                }
                if(i == len)    {
                    res.add(temp.val);
                }
            }
        }
        return res;
    }
}