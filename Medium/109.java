class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        int count = 0;
        ListNode currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        int[] arr = new int[count];
        currNode = head;
        for (int i = 0; i < count; i++) {
            arr[i] = currNode.val;
            currNode = currNode.next;
        }
        return buildTree(arr, 0, count - 1);
    }

    public TreeNode buildTree(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode newNode = new TreeNode(arr[mid]);
        newNode.left = buildTree(arr, start, mid - 1);
        newNode.right = buildTree(arr, mid + 1, end);
        return newNode;
    }
}