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
class BSTIterator {
    List<Integer> lst;
    int curr = 0;
    public BSTIterator(TreeNode root) {
        lst = new ArrayList<>();
        curr = 0;
        this.iterate(root);
    }
    public void iterate(TreeNode root)  {
        if(root.left != null)   {
            iterate(root.left);
        }
        lst.add(root.val);
        if(root.right != null)  {
            iterate(root.right);
        }
    }
    
    public int next() {
        curr++;
        return lst.get(curr - 1);
    }
    
    public boolean hasNext() {
        return !(curr >= lst.size());
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */