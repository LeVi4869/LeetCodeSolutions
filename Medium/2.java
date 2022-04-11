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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean additionCheck = false;
        ListNode head = new ListNode(0);
        ListNode currNode = head;
        while(l1 != null || l2 != null)
        {
            int sum = 0;
            if(l1 == null)
            {
                sum = l2.val;
                l2 = l2.next;
            }
            else if(l2 == null)
            {
                sum = l1.val;
                l1 = l1.next;
            }
            else
            {
                sum = l1.val + l2.val;
                l1 = l1.next; l2 = l2.next;
            }  
            if(additionCheck == true)
                sum ++;
            if(sum >= 10)
            {
                additionCheck = true;
                sum = sum % 10;
            }
            else
            {
                additionCheck = false;
            }
            currNode.next = new ListNode(sum);
            currNode = currNode.next;
        }
        if(additionCheck == true)
        {
            currNode.next = new ListNode(1);
        }
        return head.next;
    }
}