/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode l1=head;
        ListNode l2=head;
        while(l1!=null && l1.next!=null)
        {
           l1= l1.next.next;
           l2= l2.next;
            if(l1==l2)
            {
                return true;
            }  
        }
         return false;
    }
}
