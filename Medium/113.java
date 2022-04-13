class Solution {
    List<List<Integer>> list;
    List<Integer> tempList;

    public Solution() {
        list = new ArrayList<List<Integer>>();
        tempList = new ArrayList<Integer>();
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return list;
        }
        helper(root, targetSum);
        return list;
    }

    public void helper(TreeNode root, int target) {
        target -= root.val;
        tempList.add(root.val);
        if (root.left == null && root.right == null && target == 0) {
            list.add(new ArrayList<Integer>(tempList));
        }
        if (root.left != null) {
            helper(root.left, target);
        }
        if (root.right != null) {
            helper(root.right, target);
        }
        tempList.remove(tempList.size() - 1);
    }
}