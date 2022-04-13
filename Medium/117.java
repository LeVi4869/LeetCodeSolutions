class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = findNext(root);
            }
        }
        if (root.right != null) { // update right next
            root.right.next = findNext(root);
        }
        connect(root.right); // update the right nodes first
        connect(root.left);
        return root;

    }

    private Node findNext(Node root) { // get parent node
        while (root.next != null) { // scan all next parent nodes until we find the first left or right child
            root = root.next;
            if (root.left != null)
                return root.left;
            if (root.right != null)
                return root.right;
        }
        return null;
    }
}