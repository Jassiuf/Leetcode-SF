
class Solution {
    
     public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null ) return head;
        ListNode slow = head, fast = head;
        int len = 1;
         while(fast.next != null) {
             len++;
             fast = fast.next;
         }
         k = k % len;         
         for (int i = 1; i < len - k; i++)
             slow = slow.next;         

         fast.next = head;
         head = slow.next;
         slow.next = null;
         return head;
    }
}