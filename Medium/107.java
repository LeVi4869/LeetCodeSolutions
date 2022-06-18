class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)    {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int k = queue.size();
            for(int i = 0; i < k; ++i)   {
                TreeNode tempNode = queue.poll();
                if(tempNode.right != null)  {
                    queue.offer(tempNode.right);
                }
                if(tempNode.left != null)  {
                    queue.offer(tempNode.left);
                }
                temp.add(0, tempNode.val);
            }
            res.add(0, temp);
        }
        return res;
    }
}