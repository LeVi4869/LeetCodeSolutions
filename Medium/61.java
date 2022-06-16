class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0 || head.next == null)  {
            return head;
        }
        int size = 1;
        ListNode last = head;
        while(last.next != null) {
            size++;
            last = last.next;
        }
        if(k % size == 0)   {
            return head;
        }
        k = k % size;
        k = size - k;
        ListNode cutoff = head;
        for(int i = 0; i < k - 1; ++i)  {
            cutoff = cutoff.next;
        }
        ListNode newHead = cutoff.next;
        cutoff.next = null;
        last.next = head;
        return newHead;
    }
}