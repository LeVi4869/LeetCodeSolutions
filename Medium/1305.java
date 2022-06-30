class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        traverse(root1, lst1);
        traverse(root2, lst2);
        int index1 = 0;
        int index2 = 0;
        while(index1 < lst1.size() && index2 < lst2.size()) {
            if(lst1.get(index1) < lst2.get(index2)) {
                result.add(lst1.get(index1));
                ++index1;
            }
            else    {
                result.add(lst2.get(index2));
                ++index2;
            }
        }
        while(index1 < lst1.size()) {
            result.add(lst1.get(index1));
            ++index1;
        }
        while(index2 < lst2.size()) {
            result.add(lst2.get(index2));
            ++index2;
        }
        return result;
    }
    public void traverse(TreeNode root, List<Integer> lst)   {
        if(root == null)    {
            return;
        }
        traverse(root.left, lst);
        lst.add(root.val);
        traverse(root.right, lst);
    }
}