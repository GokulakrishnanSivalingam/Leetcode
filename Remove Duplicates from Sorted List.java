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
    public ListNode deleteDuplicates(ListNode head) {
    
        ListNode tail=head;
        while(tail!=null&&tail.next!=null)
        {
            if(tail.val==tail.next.val)
            {
              tail.next=tail.next.next;
        }
        else{
            tail=tail.next;
        }
        }
        return head;
    }
}
