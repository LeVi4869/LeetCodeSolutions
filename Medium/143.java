/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)    {
            return;
        }
        ListNode mid = head;
        ListNode end = head;
        while(end.next != null && end.next.next != null)  {
            end = end.next.next;
            mid = mid.next;
        }
        ListNode currSwap = mid.next;
        while(currSwap.next != null) {
            ListNode temp = currSwap.next;
            currSwap.next = temp.next;
            temp.next = mid.next;
            mid.next = temp;
        }
        ListNode l1 = head;
        ListNode l2 = mid.next;
        while(l1 != mid)   {
            mid.next = l2.next;
            l2.next = l1.next;
            l1.next = l2;
            l1 = l2.next;
            l2 = mid.next;
        }
    }
}   