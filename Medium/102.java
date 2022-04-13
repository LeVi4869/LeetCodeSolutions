class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        return traverse(root, 0, res);
    }

    public static List<List<Integer>> traverse(TreeNode node, int level, List<List<Integer>> list) {
        if (node == null) {
            return list;
        }
        if (list.size() < level + 1) {
            List<Integer> newList = new ArrayList<Integer>();
            list.add(newList);
        }
        list.get(level).add(node.val);
        traverse(node.left, level + 1, list);
        traverse(node.right, level + 1, list);
        return list;
    }
}