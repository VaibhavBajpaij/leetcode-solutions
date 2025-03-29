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
    public int pairSum(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode headsecond = slow;
        ListNode prev = null;
        ListNode curr = slow;
        ListNode a;


        while(curr!=null){
            a=curr.next;
            curr.next=prev;
            prev=curr;
            curr=a;
        }
          headsecond = prev; 
        ListNode temp1 = head;
        ListNode temp2 = headsecond;
        int maxsum = 0;
        while(temp2!=null){
            int val1=temp1.val;
            int val2=temp2.val;
            int sum=val1+val2;
            maxsum = Math.max(sum, maxsum);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return maxsum;
        
    }
}
