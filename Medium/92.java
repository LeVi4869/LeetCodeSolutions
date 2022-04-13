class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1;
        ListNode newHead = new ListNode(head.val);
        ListNode currNode = head;
        ListNode tempNode = newHead;
        ListNode lastNode;
        while (currNode != null) {
            if (count == right + 1) {
                while (tempNode.next != null) {
                    tempNode = tempNode.next;
                }
            }
            if (count <= right && count >= left) {
                tempNode.next = new ListNode(currNode.val, tempNode.next);
                currNode = currNode.next;
            } else {
                tempNode.next = new ListNode(currNode.val);
                currNode = currNode.next;
                tempNode = tempNode.next;
            }
            ++count;
        }
        return newHead.next;
    }
}