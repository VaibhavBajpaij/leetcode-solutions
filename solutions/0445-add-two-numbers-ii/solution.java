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
        ListNode prev=null;
        ListNode curr=head;
        ListNode a=head;

        while(curr!=null){
            a=curr.next;
            curr.next=prev;
            prev=curr;
            curr=a;
        }

        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newl1=reverse(l1);
        ListNode newl2=reverse(l2);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        int carry=0;
        while(newl1!=null || newl2!=null){
            int val1=0;
             int val2=0;
            if(newl1!=null) val1=newl1.val;
            if(newl2!=null) val2=newl2.val;
            int num=val1+val2+carry;
            ListNode node =new ListNode(num%10);
            temp.next=node;
            temp=temp.next;
            if(newl1!=null) newl1=newl1.next;
             if(newl2!=null) newl2=newl2.next;
             carry=num/10;


            
        }
        if(carry==1){
            ListNode Node=new ListNode(1);
            temp.next=Node;
            temp=temp.next;

        }
        ListNode newhead=reverse(dummy.next);
        return newhead;
        
    }
}
