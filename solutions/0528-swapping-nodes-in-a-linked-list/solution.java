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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode slow=head;
        ListNode fast=head;
        ListNode first=head;
        for(int i=1;i<k;i++){
            fast=fast.next;
            first=first.next;
        }
          fast = fast.next; 
        
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int temp=slow.val;
        slow.val=first.val;
        first.val=temp;
        return head;

        // this is the simple approch 

        // ListNode temp=head;
        // int len=0;
        // while(temp!=null){
        //     len++;
        //     temp=temp.next;
        // }
        // temp=head;
        // ListNode last=head;
        // for(int i=1;i<=len-k;i++){
        //     last=last.next;
        // }
        // ListNode first=head;
        // for(int i=1;i<k;i++){
        //     first=first.next;
        // }
        // int tem=last.val;
        // last.val=first.val;
        // first.val=tem;
        // return head;
        
    }
}
