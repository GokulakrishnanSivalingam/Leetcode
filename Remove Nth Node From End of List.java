class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode t = head;

        while (t != null) {
            length++;
            t = t.next;
        }

        int target = length - n;

        if (target == 0) {
            return head.next;
        }

        t = head; 

        for (int i = 0; i < target-1 ; i++) {
            t = t.next;
        }

    
        t.next = t.next.next;

        return head;
    }
}
