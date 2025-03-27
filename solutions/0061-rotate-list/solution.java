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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null || head.next==null ) return head;
        ListNode fast=head;
        ListNode slow=head;
        int n=0;
        while(fast!=null){
            fast=fast.next;
            n++;
        }
        k=k%n;
         if( k==0) return head;
        fast=head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        //if(fast==null && fast.next==null) return head;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;

        }
        ListNode newHead=slow.next;
        slow.next=null;
        fast.next=head;
        return newHead;
        

        
        
    }
}
