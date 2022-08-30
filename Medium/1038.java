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
    static int total = 0;
    static int last = 0;
    public TreeNode bstToGst(TreeNode root) {
        total = 0;
        countTotal(root);
        last = 0;
        transform(root);
        return root;
    }
    public static void transform(TreeNode root){
        if(root == null)    {
            return;
        }
        transform(root.left);
        int temp = root.val;
        total -= last;
        root.val = total;
        last = temp;
        transform(root.right);
    }
    public static void countTotal(TreeNode root) {
        if(root == null)    {
            return;
        }
        total += root.val;
        countTotal(root.left);
        countTotal(root.right);
    }
}