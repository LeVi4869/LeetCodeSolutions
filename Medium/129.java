class Solution {
    int curr = 0;
    int res = 0;

    public int sumNumbers(TreeNode root) {
        res = 0;
        curr = 0;
        helper(root);
        return res;
    }

    public void helper(TreeNode root) {
        curr = curr * 10 + root.val;
        if (root.left == null && root.right == null) {
            res += curr;
        }
        if (root.left != null) {
            helper(root.left);
        }
        if (root.right != null) {
            helper(root.right);
        }
        curr = curr / 10;
        return;
    }
}