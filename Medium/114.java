class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            flatten(root.left);
        }
        if (root.right != null) {
            flatten(root.right);
        }
        if (root.left != null) {
            highestLeftDescendant(root.left).right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }

    public TreeNode highestLeftDescendant(TreeNode head) {
        if (head.right != null) {
            return highestLeftDescendant(head.right);
        }
        return head;
    }
}