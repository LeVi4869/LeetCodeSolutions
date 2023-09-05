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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode left = head;
        ListNode right = head.next;
        while(right != null){
            ListNode newNode = new ListNode(gcd(left.val, right.val), right);
            left.next = newNode;
            left = right;
            right = right.next;
        }
        return head;
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}