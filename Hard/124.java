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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    public int helper(TreeNode root)    {
        if(root == null)    {
            return 0;
        }
        int leftMax = helper(root.left);
        int rightMax = helper(root.right);
        int cont = Math.max(Math.max(leftMax, rightMax), 0) + root.val;
        int temp = Math.max(root.val + leftMax + rightMax, cont);
        max = Math.max(temp, max); 
        return cont;
    }
}