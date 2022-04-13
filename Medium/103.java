
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        int level = 1;
        while (!stack.isEmpty()) {
            int size = stack.size();
            List<TreeNode> tempList = new ArrayList<TreeNode>();
            List<Integer> levelList = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = stack.pop();
                tempList.add(temp);
                levelList.add(temp.val);
            }
            res.add(levelList);
            for (int i = 0; i < size; i++) {
                TreeNode process = tempList.get(i);
                if (level % 2 == 1) {
                    if (process.left != null)
                        stack.push(process.left);
                    if (process.right != null)
                        stack.push(process.right);
                } else {
                    if (process.right != null)
                        stack.push(process.right);
                    if (process.left != null)
                        stack.push(process.left);
                }
            }
            level++;
        }
        return res;
    }
}