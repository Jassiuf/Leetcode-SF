/**
     Given a linked list, swap every two adjacent nodes and return its head.Your algorithm should use only constant extra space.
     You may not modify the values in the list's nodes, only nodes itself may be changed.
 */

class Solution {
    public ListNode swapPairs(ListNode head) {
        // sanity checks
        if (head == null || head.next == null || head.next == head) 
            return head;
        
        ListNode res = head;
        ListNode p = head, q = head.next;
        while (p != null && q != null) {
            int temp = p.val;
            p.val = q.val;
            q.val = temp;
            p = p.next.next;
            if(p != null) q = p.next;
        }
        return res;
    }
}