class Solution {
    public List<TreeNode> generateTrees(int n) {
        return genTrees(1, n);
    }

    public List<TreeNode> genTrees(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        List<TreeNode> left, right;
        for (int i = start; i <= end; i++) {
            left = genTrees(start, i - 1);
            right = genTrees(i + 1, end);
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    list.add(root);
                }
            }
        }
        return list;
    }
}