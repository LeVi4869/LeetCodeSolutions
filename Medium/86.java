
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode lessNodeHead = new ListNode(0);
        ListNode lessNode = lessNodeHead;
        ListNode greaterNodeHead = new ListNode(0);
        ListNode greaterNode = greaterNodeHead;
        while (head != null) {
            if (head.val >= x) {
                greaterNode.next = head;
                greaterNode = greaterNode.next;
            } else {
                lessNode.next = head;
                lessNode = lessNode.next;
            }
            head = head.next;
        }
        greaterNode.next = null;
        lessNode.next = greaterNodeHead.next;
        return lessNodeHead.next;
    }
}