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
    private ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode a=head;
        while(curr!=null){
            a=curr.next;
            curr.next=prev;
            prev=curr;
            curr=a;
        }
        return prev;

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head; 

        ListNode a=null , b=null ,c=null ,d=null;
        ListNode temp=head;
        int pos=1;
        while(temp!=null){
            if(pos==left-1) a=temp;
            if(pos==left) b=temp;
            if(pos==right) c=temp;
            if(pos==right+1) d=temp;
            pos++;
            temp=temp.next;
        }
        
        if(a!=null) a.next=null;
        if(c!=null) c.next=null;
        reverse(b);
        if(a!=null) a.next=c;
        if(b!=null) b.next=d;
        if(a==null) return c;
        return head;

        
    }
}
