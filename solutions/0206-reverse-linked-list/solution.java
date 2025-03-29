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
    public ListNode reverseList(ListNode head) {


        // This is the Reverse it by Iteration which take O(n) time complexity and O(1) space 
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
        





        // Reverse bY recursive approch which takes O(n) time complexity and O(n ) space which is not good

        // if(head==null || head.next==null) return head;
        // ListNode a=head.next;
        // ListNode Newhead=reverseList(a);
        // a.next=head;
        // head.next=null;
        // return Newhead;
    }
}
