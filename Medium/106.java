class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1, postorder, postorder.length - 1);
    }

    private TreeNode build(int[] inorder, int startInd, int endInd, int[] postorder, int postLast) {
        if (startInd > endInd || postLast < 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postLast]);
        int pivot = 0;
        for (int i = startInd; i <= endInd; i++) {
            if (inorder[i] == root.val) {
                pivot = i;
                break;
            }
        }
        root.left = build(inorder, startInd, pivot - 1, postorder, postLast - (endInd - pivot) - 1);
        root.right = build(inorder, pivot + 1, endInd, postorder, postLast - 1);
        return root;
    }
}