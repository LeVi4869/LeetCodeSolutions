class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 1) {
            return lists[0];
        }
        if (lists.length == 0) {
            return null;
        }
        ListNode head = mergeTwoLists(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            head = mergeTwoLists(head, lists[i]);
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode ans = h;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                h.next = l1;
                h = h.next;
                l1 = l1.next;
            } else {
                h.next = l2;
                h = h.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            h.next = l2;
        }
        if (l2 == null) {
            h.next = l1;
        }
        return ans.next;
    }
}