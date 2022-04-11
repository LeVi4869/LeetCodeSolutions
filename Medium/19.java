/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode iter1 = head;
        ListNode iter2 = head;
        for (int i = 0; i < n; i++) {
            iter2 = iter2.next;
        }
        if (iter2 == null) {
            head = head.next;
            return head;
        }
        while (iter2.next != null) {
            iter2 = iter2.next;
            iter1 = iter1.next;
        }
        iter1.next = iter1.next.next;
        return head;
    }
}