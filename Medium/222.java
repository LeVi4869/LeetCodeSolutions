class Solution {
    public int countNodes(TreeNode root) {
        if(root == null)    {
            return 0;
        }
        TreeNode left = root;
        TreeNode right = root;
        int floor = 0;
        while(right != null)    {
            ++floor;
            left = left.left;
            right = right.right;
        }
        if(left == null)    {
            return (int)Math.pow(2, floor) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}