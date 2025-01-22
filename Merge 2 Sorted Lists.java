
class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode head =new ListNode(0);
        ListNode tail=head;
        while(a!=null&& b!=null) 
        {
            if(b.val<a.val)
            {
                tail.next=b;
                b=b.next;
            }
            else{
                tail.next=a;
                a=a.next;
            }
            tail=tail.next;
        }  
        if(a!=null){
            tail.next=a;
        }
        else{
            tail.next=b;
        }
        
        return head.next;
    

    }
}
