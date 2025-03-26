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
        if(head==null ) return null;
        ListNode front=head;
        ListNode back=head;
        
        while(front!=null){
            if(back.val==front.val){
                
                front=front.next;
               
            }
            else{
                 back.next=front;
                 back=front;

            }
           
            

        }
        back.next=null;
        return head;
        
    }
}
