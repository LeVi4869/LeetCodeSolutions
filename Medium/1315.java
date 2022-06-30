class Solution {
    public int res = 0;
    public int sumEvenGrandparent(TreeNode root) {
        res = 0;
        helper(root, false);
        return res;
    }
    public void helper(TreeNode root, boolean evenParent)   {
        if(evenParent)  {
            if(root.left != null)   {
                res += root.left.val;
            }
            if(root.right != null)  {
                res += root.right.val;
            }
        }
        if(root.left != null)   {
            helper(root.left, root.val % 2 == 0);
        }
        if(root.right != null)  {
            helper(root.right, root.val % 2 == 0);
        }
    }
}